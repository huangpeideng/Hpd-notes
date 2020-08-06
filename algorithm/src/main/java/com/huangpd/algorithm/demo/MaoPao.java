package com.huangpd.algorithm.demo;

/**
 * 冒泡排序
 *
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] num = {9,7,5,3,1,10,8,6,4,2};
        sort(num);
    }

    public static void sort(int[] num){
        int length = num.length;
        for (int i = 0; i < length -1; i++) {
            boolean flag = false;
            for (int j = 0; j < length - i - 1; j++) {
                if(num[j] > num[j+1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
