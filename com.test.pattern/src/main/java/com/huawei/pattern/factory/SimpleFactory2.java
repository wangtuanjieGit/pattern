package com.huawei.pattern.factory;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SimpleFactory2 {
    //在配置文件中定义工厂的产品有哪些，可以从一定程度上提高扩展性
    private static final String classProperties = "D:\\code\\com.test\\com.test.pattern\\src\\main\\java\\com\\huawei\\pattern\\factory/classes.properties";
    static Properties props;
    //静态块
    static {
        props = new Properties();
        try {
            props.load(new FileInputStream(classProperties));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static SimpleFactory1.BaseService getService(String className){
        SimpleFactory1.BaseService baseService = null;
        String name = props.getProperty(className);
        try {
            Class classType = Class.forName(name);
            baseService = (SimpleFactory1.BaseService) classType.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return baseService;
    }

    @Test
    public void main() {
        SimpleFactory1.BaseService serviceImpl1 = SimpleFactory2.getService("ServiceImpl1");
        serviceImpl1.play();
    }
}
