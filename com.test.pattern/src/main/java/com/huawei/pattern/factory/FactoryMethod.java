package com.huawei.pattern.factory;
import java.util.Random;

public class FactoryMethod {
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
    //基础类的工厂
    interface BaseServiceFactory{
        BaseService getService();
    }
    //实现1:掷硬币的工厂
    static class ServiceFactory1 implements BaseServiceFactory{

        public BaseService getService() {
            return new ServiceImpl1();
        }
    }
    //实现2:玩骰子的工厂
    static class ServiceFactory2 implements BaseServiceFactory{

        public BaseService getService() {
            return new ServiceImpl2();
        }
    }

    public static void main(String[] args) {
        BaseServiceFactory baseServiceFactory1 = new ServiceFactory1();
        baseServiceFactory1.getService().play();
        BaseServiceFactory baseServiceFactory2 = new ServiceFactory2();
        baseServiceFactory2.getService().play();
    }
}
