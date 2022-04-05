package com.imooc.exception;

/*
异常链:
在方法的嵌套调用中，异常被嵌套抛出
 */
public class Sample07 {

    public static void main(String[] args) {
        try {
            exceptionChain03();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exceptionChain01() throws Exception {

        throw new Exception("这是异常1");

    }

    private static void exceptionChain02() throws Exception {
        try{
            exceptionChain01();
        }catch (Exception e){
            throw new Exception("这是异常2",e);
        }

    }

    private static void exceptionChain03() throws Exception {

        try {
            exceptionChain02();
        }catch (Exception e){
            throw new Exception("这是异常3",e);
        }
    }
}
