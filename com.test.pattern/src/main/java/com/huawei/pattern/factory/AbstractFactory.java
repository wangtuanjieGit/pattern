package com.huawei.pattern.factory;

import java.util.Random;

public class AbstractFactory {

    //基础类(接口),人
    interface BaseUser{
        void getName();
    }
    //用户1：小明
    static class User1 implements BaseUser{
        public void getName() {
            System.out.println("小明");
        }
    }
    //用户2：小红
    static class User2 implements BaseUser{
        public void getName() {
            System.out.println("小红");
        }
    }
    /*-------------------------------------------------*/
    //基础类(接口),玩
    interface BaseService{
        void play();
    }
    //实现1:掷硬币
    static class ServiceImpl1 implements BaseService {
        public void play() {
            int random = new Random().nextInt(2);
            System.out.println("掷硬币：" +  random);
        }
    }
    //实现2:玩骰子
    static class ServiceImpl2 implements BaseService {
        public void play() {
            int random = new Random().nextInt(6);
            System.out.println("玩骰子：" +  random);
        }
    }
    /*-------------------------------------------------*/
    //所有基础类的抽象工厂类
     interface InnerAbstractFactory{
        BaseUser getUser();
        BaseService getServie();
    }
    //具体的工厂类：根据场景构造特定的子类
    static class EventFactory1 implements InnerAbstractFactory{
        public BaseUser getUser() {
            return new User1();
        }
        public BaseService getServie() {
            return new ServiceImpl1();
        }
    }
    //具体的工厂类：根据场景构造特定的子类
    static class EventFactory2 implements InnerAbstractFactory{
        public BaseUser getUser() {
            return new User2();
        }
        public BaseService getServie() {
            return new ServiceImpl2();
        }
    }
    /*-------------------------------------------------*/
    //调用时根据场景实例化不同的具体工厂类
    public static void main(String[] args) {
        InnerAbstractFactory abstractFactory1 = new EventFactory1();
        abstractFactory1.getUser().getName();
        abstractFactory1.getServie().play();

        InnerAbstractFactory abstractFactory2 = new EventFactory2();
        abstractFactory2.getUser().getName();
        abstractFactory2.getServie().play();
    }
}
