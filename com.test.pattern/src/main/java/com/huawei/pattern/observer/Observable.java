package com.huawei.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    Set<Observer> observerSet = new HashSet<Observer>();
    String message;
    void addObserver(Observer observer){
        observerSet.add(observer);
    }

    void removeObserver(Observer observer){
        if(observerSet != null && observerSet.contains(observer)){
            observerSet.remove(observer);
        }
    }

    void notifyObserver(){
        for(Observer one : observerSet){
            one.doSomething(message);
        }
    }
    void notifyObserver(Observer observer){
         observer.doSomething(message);
    }

    void sendMessage(String message){
        System.out.println("observable send a message:" + message);
        this.message = message;
        notifyObserver();
    }
}
