package com.imooc.array;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * 一维数组
 */
public class Sample01 {

    public static void main(String[] args) {
        // 数组声明
        int[] intArray;
        // 创建数组
        intArray = new int[10];
        String[] strArray = new String[10];
        // 数组是一个对象，lenth方法是对象的引用
        int len = strArray.length;
        //增强型for循环
        for (int n:intArray){
            System.out.print(n + " ");
        }
        // 从小到大排序
        intArray = new int[]{1,34,53,53,11,12,123,11,2,4,2,3441,1,};
        // 生成100000个随机数
        int n = 100000;
        int[] nums = new int[n];
        for (int i = 0; i < n;i++){
            nums[i] = new Random().nextInt(n);
        }
        // 冒泡排序
        sort1(nums);
        // Array排序
        sort2(nums);
        // 我的排序
        sort3(nums);



    }


    private static void sort3(int[] nums) {

        long s_time = new Date().getTime();
        for (int i = 0;i < nums.length - 1;i++){
            for (int j = 0;j < nums.length -i -1;j++){
                if (nums[j] > nums[j+1]){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
        System.out.println("sort3:" + (new Date().getTime() - s_time));
    }

    private static void sort1(int[] intArray) {
        long s_time = new Date().getTime();
        for (int i = 0;i < intArray.length;i++){
            int minI = i;
            for (int j = i + 1;j < intArray.length;j++){
                if (intArray[j] < intArray[minI]){
                    minI = j;
                }
            }
            int t = intArray[minI];
            intArray[minI] = intArray[i];
            intArray[i] = t;
        }
        System.out.println("sort1:" + (new Date().getTime() - s_time));
    }

    private static void sort2(int[] intArray) {
        long s_time = new Date().getTime();
        Arrays.sort(intArray);
        System.out.println("sort2:" + (new Date().getTime() - s_time));
    }

}
