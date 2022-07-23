package com.jiaolin.reflection;

import org.testng.annotations.Test;

/**
 * @author johnny
 * @Classname ReflectionApiTest1
 * @Description 反射的7点
 *  反射点认识 ： 动态语言 反射就像一面镜子,能够解析类里面的任何属性。
 *  2 获取calss类的4种实例
 * @Date 2022/7/23 11:35
 */
public class ReflectionApiTest1 {

    // 获取反射的4种方式
    @Test
    public void test1() throws Exception {
        // 第1种方式调用运行时类的属性
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        // 第2种方式 通过运行时类的对象,进行调用getClass()
        Person person = new Person();
        Class<? extends Person> personClass1 = person.getClass();
        System.out.println(personClass1);

        // 第3种方式,通过forName("全类限定名")
        Class<?> personClass2 = Class.forName("com.jiaolin.reflection.Person");
        System.out.println(personClass2);


        ClassLoader classLoader = ReflectionApiTest1.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("com.jiaolin.reflection.Person");
        System.out.println(aClass);

        System.out.println();
        System.out.println(aClass==personClass1);
        System.out.println(aClass==personClass2);

    }
}
