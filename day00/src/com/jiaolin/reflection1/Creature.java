package com.jiaolin.reflection1;

import java.io.Serializable;

/**
 * @author johnny
 * @Classname Creature
 * @Description
 * @Date 2022/7/23 16:01
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}