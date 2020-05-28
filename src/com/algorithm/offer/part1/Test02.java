package com.algorithm.offer.part1;

import java.lang.reflect.Array;

/**
 * 《剑指offer》第三题
 * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author meimingzhi
 * @Date 2020/2/12 3:37 下午
 */
//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9

public class Test02 {
    public static boolean findElement(int[][] array, int element){
        int i = array.length-1;
        int j = 0;
        while (i>=0 && j<array[i].length){
            if (element == array[i][j]){
                return true;
            } else if (element < array[i][j]){
                i--;
            }else
                j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[0] = new int[]{1,2,3,4,5};
        array[1] = new int[]{2,3,4,5,6};
        array[2] = new int[]{3,4,5,6,7};
        array[3] = new int[]{4,5,6,7,8};
        array[4] = new int[]{5,6,7,8,9};
        System.out.println(Test02.findElement(array,3));
    }

}
