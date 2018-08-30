package com.huawei.pattern.observer;

public class ObserverImpl1 implements Observer{
    public void doSomething(String message) {
        System.out.println("ObserverImpl1 get a message:" + message);
    }
}
