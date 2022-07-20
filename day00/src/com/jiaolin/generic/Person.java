package com.jiaolin.generic;

/**
 * @author johnny
 * @Classname Person
 * @Description 自定义泛型类
 * @Date 2022/7/20 18:27
 */
public class Person<T> {

    private T info;

    private T getInfo() {
        return info;
    }

    private void setInfo(T info) {
        this.info = info;
    }

    public Person() {

    }

    public Person(T info) {
        this.info = info;
    }
}
