package com.jiaolin.reflection2;

import java.lang.reflect.Proxy;

/**
 * @author johnny
 * @Classname DynamicProxyTest1
 * @Description 动态代理 1
 * 产生的问题点
 * 1。怎么生成类,并和代理类进行绑定。
 * 2。怎么调用类的方法
 * @Date 2022/7/24 11:16
 */
public class DynamicProxyTest1 {
    public static void main(String[] args) {
        ProxyFactory1 proxyFactory1 = new ProxyFactory1(new SuperMan());
        Human human = (Human) proxyFactory1.getInstance();
        human.read();
        String fly = human.fly("水里");
        System.out.println(fly);

    }
}

interface Human {
    void read();

    String fly(String path);
}

class SuperMan implements Human {

    @Override
    public void read() {
        System.out.println("超人读书");
    }

    @Override
    public String fly(String path) {
        System.out.println(path);
        return path + "飞";
    }
}

class ProxyFactory1 {

    private Object obj;

    public ProxyFactory1(Object obj) {
        this.obj = obj;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                (proxy, method, args) -> method.invoke(obj, args));
    }
}