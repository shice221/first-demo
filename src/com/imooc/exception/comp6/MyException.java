package com.imooc.exception.comp6;

/*
自定义异常，继承Exception
 */
public class MyException extends Exception{

    private int code;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private String msg;
    public MyException(int coed,String msg){
        // 父类构造函数，传递一个字符串(可无)
        super();
    }

}
