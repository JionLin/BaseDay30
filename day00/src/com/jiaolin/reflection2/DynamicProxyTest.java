package com.jiaolin.reflection2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author johnny
 * @Classname DynmicProxyTest
 * @Description 动态 dynamic
 * @Date 2022/7/24 10:05
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Teach teach = (Teach) ProxyFactory2.getInstance(teacher);
        teach.teach();
        String eat = teach.eat("水果");
        System.out.println(eat);

    }
}

interface Teach {

    void teach();

    String eat(String name);
}


// 被代理类
class Teacher implements Teach {

    @Override
    public void teach() {
        System.out.println("老师教书");
    }

    @Override
    public String eat(String foodName) {
        System.out.println("老师吃 " + foodName);
        return foodName;
    }
}

/**
 * 代理类 2个原因
 * 1。如何产生一个代理对象,并进行绑定
 * 2。如何调用代理类中的方法
 */
class ProxyFactory2 {

    public static Object getInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.band(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), handler);
    }

}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public void band(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }
}