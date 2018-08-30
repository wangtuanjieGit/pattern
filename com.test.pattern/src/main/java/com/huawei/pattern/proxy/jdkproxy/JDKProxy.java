package com.huawei.pattern.proxy.jdkproxy;

import com.huawei.pattern.proxy.BaseService;
import com.huawei.pattern.proxy.BaseServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
    private Object object;

    public Object bind(final Object object){
        this.object = object;
//        return (Object)Proxy.newProxyInstance(Object.class.getClassLoader(),
//         new Class[]{Object.class},
//         this);
        return (Object)Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");
        Object re = method.invoke(object, args);
        System.out.println("代理后");
        return re;
    }

    public static void main(String[] args) {
        /**
         * newProxyInstance(ClassLoader loader,//被代理的类加载器tar.getClass().getClassLoader(),
         *               Class<?>[] interfaces,//被代理的类接口，注意是Class  tar.getClass().getInterfaces(),
         *                InvocationHandler h)//代理。要实现InvocationHandler
         */
        BaseServiceImpl baseServiceimpl = new BaseServiceImpl();
        BaseService baseService = (BaseService)new JDKProxy().bind(baseServiceimpl);
        baseService.doService();
    }
}
/**
 * 代理前
 * BaseServiceImpl do service
 * 代理后
 */
