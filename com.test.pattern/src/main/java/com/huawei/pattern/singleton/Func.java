package com.huawei.pattern.singleton;

public class Func {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1.hashCode());
        System.out.println(hungrySingleton2.hashCode());
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());
        System.out.println(lazySingleton2.hashCode());
    }
}

/**
 * out
 * 1163157884
 * 1163157884
 * 1956725890
 * 1956725890
 */
