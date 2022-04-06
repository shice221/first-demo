package com.imooc.array;

import java.util.Arrays;

/**
 * 二维数组
 */
public class Sample02 {

    public static void main(String[] args) {
        // 创建二维数组
        // 如果只指定了行数，后续的一维数组需要额外创建
        int[][] nums = new int[5][];
        for(int i = 0;i < nums.length;i++){
            nums[i] = new int[5];
        }
        // 一步到位创建二维数组
        int[][] nums2 = new int[5][5];
        // 二维数组初始化
        int[][] nums3 = new int[][]{{2},{2}};
    }
}
