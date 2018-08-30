package com.huawei.pattern.factory;

import java.util.Random;

public class NoFactory {
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
    public static void main(String[] args) {
        //调用时根据实现不同来产生不同的子类
        BaseService serviceImpl1 = new ServiceImpl1();
        serviceImpl1.play();
        BaseService serviceImpl2 = new ServiceImpl2();
        serviceImpl2.play();
    }
}
