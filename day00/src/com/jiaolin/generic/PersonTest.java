package com.jiaolin.generic;

/**
 * @author johnny
 * @Classname PersonTest 如果为 <T extends  Person3> 的形式,那么这个T 必须 <= person3 才行
 * @Description
 * @Date 2022/7/20 18:43
 */
public class PersonTest {
    public static <T extends  Person3> void test(T t){
        System.out.println(t);
    }





    public static void main(String[] args) {
        test(new Person3());
        test(new Man());
        // 编译通过失败
        // test(new Creature());
    }
}

class Creature{}

class Person3 extends  Creature{}

class Man extends  Person3{}

