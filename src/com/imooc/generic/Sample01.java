package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型概述
 */
public class Sample01 {

    public static void main(String[] args) {
        // 泛型的使用
        List<String> list = new ArrayList<String>();
        // Java SE7及以后的版本，构造方法中可以省略泛型类型
        List<String> list1 = new ArrayList<>();
        /*
        多态与类型
        错误例子：// 变量声明的类型必须匹配传递给实际对象的类型
        List<Animal> list - new ArrayList<Cat>();
         */




    }

}
