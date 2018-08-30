package com.huawei.pattern.proxy.simpleproxy;

import com.huawei.pattern.proxy.BaseService;
import com.huawei.pattern.proxy.BaseServiceImpl;

public class SimpleProxy implements BaseService {
    BaseService baseService;

    public SimpleProxy(final BaseService baseService){
        this.baseService = baseService;
    }
    public void doService() {
        baseService.doService();
    }

    public static void main(String[] args) {
        SimpleProxy simpleProxy = new SimpleProxy(new BaseServiceImpl());
        simpleProxy.doService();
    }
}
