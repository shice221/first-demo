package com.imooc.generic.comp02;

import java.util.List;

public class GoodSeller {
    /*
    如果不如此设置，传递参数只能为Goods类型
    不能在子类上通用
    当然，可以在子类的泛型声明为Goods
    但，这不符合泛型的初衷，即限制使用的类型
    于是，有以下的用法
     */
    public void sellGoods(List<? extends Goods> goodsList){
        for (Goods g:goodsList){
            g.sell();
        }
    }
}
