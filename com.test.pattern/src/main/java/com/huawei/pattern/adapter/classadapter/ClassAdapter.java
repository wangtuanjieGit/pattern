package com.huawei.pattern.adapter.classadapter;
//适配器同时继承，实现目标和被适配类
public class ClassAdapter extends Resource implements Target {
    @Override
    public void method1(){
        System.out.println("you can exe method1 with ClassAdapter");
    }

    public void method2() {
    }

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        ((ClassAdapter) target).method1();
    }
}
