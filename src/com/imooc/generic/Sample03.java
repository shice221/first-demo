package com.imooc.generic;

import com.imooc.generic.comp03.NumGeneric;
import com.imooc.generic.comp03.ParamGenric;

/**
 * 自定义泛型
 */
public class Sample03 {

    public static void main(String[] args) {
        NumGeneric<Integer> numGeneric = new NumGeneric<>();
        numGeneric.setNum(100);
        System.out.println(numGeneric.getNum());

        ParamGenric<Integer,String> paramGenric = new ParamGenric<>(100,"苹果");
        System.out.println("我有"+paramGenric.getParam1()+paramGenric.getParam1().getClass().getName()+paramGenric.getParam2());
    }

}
