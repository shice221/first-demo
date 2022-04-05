package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * return 关键字在异常处理中的作用
 */
public class Sample03 {

    public static void main(String[] args) {
        int res = test();
        System.out.println("res:"+res);
    }

    private static int test() {

        System.out.println("=====开始运行=====");
        try{
            System.out.println("=====开始输入=====");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            /*
               该处的return语句能够被执行
               但由于finally语句的存在
               并不能返回结果
               如果finally语句也有return语句
               则返回finally中的return
            */
            return a/b;

        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("=====运行结束=====");
            return -2;
        }
    }
}
