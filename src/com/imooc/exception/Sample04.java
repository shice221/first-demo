package com.imooc.exception;

import java.util.Scanner;

/*
使用throws声明异常类型
如果调用的方法本身没有处理异常的能力
可以将方法声明处将异常抛出
转交给调用方法的其他程序片段处理
 */
public class Sample04 {


    public static void main(String[] args) {
        try {
            int res = test();
            System.out.println("res:"+res);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (Exception e){

        } finally {
        }
    }
    /* 对于非检查异常，编译器不会要求处理
       比如ArithmeticException
       对于Exception，必须进行捕获
     */
    private static int test() throws ArithmeticException,Exception{
        System.out.println("=====开始运行=====");
        System.out.println("=====开始输入=====");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a/b;
    }
}
