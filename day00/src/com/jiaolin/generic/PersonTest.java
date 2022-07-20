package com.jiaolin.generic;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author johnny
 * @Classname PersonTest 如果为 <T extends  Person3> 的形式,那么这个T 必须 <= person3 才行
 * @Description 泛型在类型中的体现 如果B是A的一个子类型,而G是具有泛型的类或者接口,那么G<B>不是G<A>的子类型,从 testGenericAndSubClass可以看出
 * ? extends A 使用的类型必须是继承A类或者A接口,即<=
 * ? super A 使用时指定的类型不能小于操作的类 即 >=
 * @Date 2022/7/20 18:43
 */
public class PersonTest {
    public static <T extends Person3> void test(T t) {
        System.out.println(t);
    }


    public void testGenericAndSubClass() {
        List<Person3> list = null;
        List<Man> list1 = null;
        // 那么G<B>不是G<A>的子类型
        // list=list1;

        // Person3 是 Man的父类
        Person3[] person3s = null;
        Man[] mans = null;
        person3s = mans;


    }


    public static void printCollection(Collection<? extends Person3> collection) {
        //   Iterator 只能使用  Iterator<? extends Person3> 或者使用 Iterator<? >
        // Iterator<? extends Person3> iterator = collection.iterator();
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public static void addStrings(List<? super Person3> list) {
        list.add(new Person3());
        list.add(new Man());
    }

    public static void addStrings2(List<? extends Person3> list) {

        // 为啥不让。奇怪
        // list.add(new Creature());
        // list.add(new Person3());
        // list.add(new Man());
    }

    public static void main(String[] args) {
        test(new Person3());
        test(new Man());
        // 编译通过失败
        // test(new Creature());
    }
}

class Creature {
}

class Person3 extends Creature {
}

class Man extends Person3 {
}

