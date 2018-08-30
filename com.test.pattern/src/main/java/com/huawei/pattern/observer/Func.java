package com.huawei.pattern.observer;

public class Func {
    public static void main(String[] args) {
        Observer observer = new ObserverImpl();
        Observer observer1 = new ObserverImpl1();

        Observable observable = new Observable();

        observable.addObserver(observer);
        observable.addObserver(observer1);

        observable.sendMessage("tell me the truth");

    }
}
/**
 * J.U中的Observable实现
 * 1.Observer队列使用Vector(对象数组)来维护
 * 2.在添加个删除Observer对象时使用synchronized修饰，线程安全
 */
/**
 * out:
 * observable send a message:tell me the truth
 * ObserverImpl1 get a message:tell me the truth
 * ObserverImpl get a message:tell me the truth
 */
