package com.huawei.pattern.adapter;

public class Adapter2 implements Target{

    Resource resource;
    public void method1(Resource resource) {
        this.resource = resource;
        resource.method1();
    }
    public void method2() {

    }

    public static void main(String[] args) {
        Target target = new Adapter2();
        //((Adapter2) target).method1();
    }
}
