package com.jiaolin.generic;

/**
 * @author johnny
 * @Classname Dao
 * @Description 进行方法泛型化  不管类是不是泛型的,无关
 * @Date 2022/7/20 18:37
 */
public class Dao {

    // 格式为 访问权限 <泛型> 返回类型 方法名([泛型标识 参数名称])
    public <T> T getById(T t) {
        T result = null;
        return result;
    }


    public <T> T getById() {
        T result = null;
        return result;
    }

}
