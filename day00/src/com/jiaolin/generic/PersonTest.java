package com.jiaolin.generic;

import java.util.List;

/**
 * @author johnny
 * @Classname PersonTest 如果为 <T extends  Person3> 的形式,那么这个T 必须 <= person3 才行
 * @Description 泛型在类型中的体现 如果B是A的一个子类型,而G是具有泛型的类或者接口,那么G<B>不是G<A>的子类型,从 testGenericAndSubClass可以看出
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

