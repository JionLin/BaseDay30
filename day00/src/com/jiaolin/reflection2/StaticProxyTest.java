package com.jiaolin.reflection2;

/**
 * @author johnny
 * @Classname StaticProxyTest
 * @Description 静态代理
 * 1。   都实现同样都接口
 * 2.    被代理类需要实例化代理类的对象 用构造器进行
 *
 * 特点 代理类和被代理类 在编译期间就确定下来了
 * @Date 2022/7/24 10:05
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ProxyFactory proxyFactory = new ProxyFactory(nikeClothFactory);
        proxyFactory.productCloth();
    }
}

interface ClothFactory {
    void productCloth();
}

class NikeClothFactory implements ClothFactory {

    @Override
    public void productCloth() {
        System.out.println("代理工厂前期工作");
        System.out.println("nike 工厂生产一批衣服");
        System.out.println("代理工厂后期工作");
    }
}

class ProxyFactory implements ClothFactory {

    /**
     * 用被代理类进行实例化
     */
    private ClothFactory factory;

    public ProxyFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void productCloth() {
        factory.productCloth();
    }
}
