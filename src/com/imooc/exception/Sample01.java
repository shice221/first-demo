package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 使用try-catch-finally处理异常
 */
public class Sample01 {
    public static void main(String[] args) {

        System.out.println("=====开始运行=====");
        try{
            System.out.println("=====开始输入=====");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            // 为了安全性考虑，最后加父类Exception
            // 但必须在最后一个catch
            e.printStackTrace();
        }finally {
            System.out.println("=====运行结束=====");
        }
    }
}
