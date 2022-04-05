package com.imooc.exception;


import com.imooc.exception.comp6.MyException;

import java.security.cert.CertStoreException;
import java.util.Scanner;

public class Sample06 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1){
                throw new MyException(1,"程序运行异常");

            }

        }catch (MyException e){
            e.printStackTrace();
            System.out.println("code:" + e.getCode() + "\n"
            +"msg:" + e.getMsg());
        }
    }

}
