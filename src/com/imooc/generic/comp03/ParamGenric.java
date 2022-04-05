package com.imooc.generic.comp03;

// 两个方法参数
public class ParamGenric<A,B> {
    private A param1;
    private B param2;


    public ParamGenric(A param1, B param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public A getParam1() {
        return param1;
    }

    public void setParam1(A param1) {
        this.param1 = param1;
    }



    public B getParam2() {
        return param2;
    }

    public void setParam2(B param2) {
        this.param2 = param2;
    }
}
