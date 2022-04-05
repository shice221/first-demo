package com.imooc.generic.comp04;

// 泛型方法不一定要在泛型类中
public class GenericMethod {

    public <T> void printValue(T t){
        System.out.println(t);
    }

}
