package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 终止finally执行的方法
 */
public class Sample02 {
    public static void main(String[] args) {

        System.out.println("=====开始运行=====");
        try{
            System.out.println("=====开始输入=====");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            // 非0，jwm终止执行
            // https://docs.oracle.com/javase/8/docs/api/
            System.exit(1);
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
