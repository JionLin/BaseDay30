package com.jiaolin.reflection1;

import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.nio.channels.Pipe;
import java.time.Period;

/**
 * @author johnny
 * @Classname OtherTest
 * @Description
 * @Date 2022/7/23 16:08
 */
public class OtherTest {

    /**
     * 使用反射获取当前属性的值 并设置进去 进行输出
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        // 使用反射获取当前属性的值 并且控制台输出来
        Class<?> clazz = Class.forName("com.jiaolin.reflection1.Person");
        Person o = (Person) clazz.newInstance();

        // 获取指定的属性 必须就有一个class对象 为public
        Field id = clazz.getField("id");
        id.set(o, 100);

        Integer pid = (Integer) id.get(o);
        System.out.println(pid);
    }

    /**
     * 获取类中指定的字段属性
     * 0。创建运行时类的对象
     * 1。 设置为可访问的。
     * 2。进行此对象的属性值
     */
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "cc");

        System.out.println(name.get(person));

    }

    /**
     * 获取运行时类对象的指定方法 包含私有
     * 1. 创建运行时 类的对象
     * 2。 设置可访问的权限
     * 3。 进行方法里面的参数设置值
     * 4。获取返回的值
     */
    @Test
    public void test3() throws Exception {
        Class<? extends Person> clazz = new Person().getClass();
        Person person = clazz.newInstance();

        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);

        String value = (String) show.invoke(person, "china");
        System.out.println(value);


        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);

        Object invoke = showDesc.invoke(Person.class);
        System.out.println(invoke);

    }

    /**
     * 获取运行时的构造器
     * <p>
     * 1. 获取指定的构造器
     * 2。进行设置可访问的权限
     * 3。使用构造器进行创建运行时对象的类
     */
    @Test
    public void test4() throws Exception {
        ClassLoader classLoader = OtherTest.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.jiaolin.reflection1.Person");


        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);

        Person per = (Person) constructor.newInstance("xxx");
        System.out.println(per);

    }

    /**
     * 获取构造器结构
     */
    @Test
    public void test5() {
        Class<Person> clazz = Person.class;
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }


    /**
     * 获取运行时类的父类
     */
    @Test
    public void test6() {
        Class<Person> personClass = Person.class;

        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);
    }

    /**
     * 获取运行时类的带泛型的父类
     */
    @Test
    public void test7() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getGenericSuperclass());

    }

    /**
     * 获取运行时类的带泛型的父类的泛型
     */
    @Test
    public void test8() {
        Class<Person> personClass = Person.class;
        Type genericSuperclass = personClass.getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());
    }

    /**
     * 获取运行时类实现的接口
     */
    @Test
    public void test9() {
        Class<Person> clazz = Person.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        System.out.println();
        // 父类实现的接口

        Class<?>[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class<?> aClass : interfaces1) {
            System.out.println(aClass);
        }

    }

    /**
     * 获取运行时类所在的包
     */
    @Test
    public void test10() {

        Class<Person> personClass = Person.class;
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
    }


    /**
     * 获取运行时类所声明的注解
     */
    @Test
    public void test11() {
        Class<Person> personClass = Person.class;
        Annotation[] annotations = personClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }


}
