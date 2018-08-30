package com.huawei.pattern.adapter.objectadapter;

//将被适配的类，作为属性，在调用时作为参数传入
public class ObjectAdapter implements Target {

    Resource resource;
    public void method1(Resource resource) {
        this.resource = resource;
        System.out.println("i exe it with ObjectAdapter");
        resource.method1();
    }
    public void method2() {

    }

    public static void main(String[] args) {
        Target target = new ObjectAdapter();
        ((ObjectAdapter) target).method1(new Resource());
    }
}
