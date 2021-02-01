package com.designpatters.creational.singleton;

public class SingletonExample {

    static SingletonExample singletonObj = new SingletonExample();

    private SingletonExample(){
    }

    public static SingletonExample getInstance(){
        return singletonObj;
    }

}
