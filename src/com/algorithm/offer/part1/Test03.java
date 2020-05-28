package com.algorithm.offer.part1;

/**
 * 《剑指offer》第四题
 * 题目：请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
 * @Author meimingzhi
 * @Date 2020/2/12 6:57 下午
 */
//we are happy
public class Test03 {
    public static String replaceSpace(String str){
        int oldLength = str.length();
//        int spaceCount = 0;
//        for (int i = 0;i<oldLength;i++){
//            if (str.charAt(i) == ' '){
//                spaceCount++;
//            }
//        }
//        int newLength = oldLength + spaceCount*2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<oldLength;i++){
            if (str.charAt(i) == ' '){
                sb.append("%20");
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "we are happy.";
        System.out.println(replaceSpace(str));
    }
}
