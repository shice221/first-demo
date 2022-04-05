package com.imooc.exception;

/**
 * 使用throw抛出异常对象
 */
public class Sample05 {


    public static void main(String[] args) {

        test();
    }

    private static void test() {

        try {
            throw new Exception("这是一个异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
