package com.huawei.pattern.factory;

import java.util.Random;

public class SimpleFactory1 {
    //基础类(接口),玩
    interface BaseService{
        void play();
    }
    //实现1:掷硬币
    static class ServiceImpl1 implements BaseService {
        public void play() {
            int random = new Random().nextInt(2);
            System.out.println("掷硬币：" +  random + " " + this.getClass().getName());
        }
    }
    //实现2:玩骰子
    static class ServiceImpl2 implements BaseService {
        public void play() {
            int random = new Random().nextInt(6);
            System.out.println("玩骰子：" +  random);
        }
    }
    //简单工厂模式:一个工厂，根据传入参数不同实现不同的子类
    static class ServiceFacory{
        public static BaseService getService(String name){
            if(name.equals("硬币")) return new ServiceImpl1();
            else if(name.equals("骰子")) return new ServiceImpl2();
            return null;
        }
    }

    public static void main(String[] args) {
        //调用工厂，传入不同参数，new 不同的子类
        ServiceFacory.getService("硬币").play();
        ServiceFacory.getService("骰子").play();
    }
}
