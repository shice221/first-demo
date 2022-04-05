package com.imooc.generic;

import com.imooc.generic.comp04.GenericMethod;

/**
 * 自定义泛型方法
 */
public class Sample04 {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue(123);
        genericMethod.printValue(123l);
        genericMethod.printValue("ASdsa");
        genericMethod.printValue(21f);
    }
}
