package com.huawei.pattern.observer;

public class ObserverImpl implements Observer {
    public void doSomething(String message) {
        System.out.println("ObserverImpl get a message:" + message);
    }
}
