package com.atguigu.test;

import java.util.Arrays;

/**
 * TODO
 *
 * @ClassName: BubbleSort
 * @author: yan
 * @since: 2020/8/13 14:07
 */
public class BubbleSort {

    public static void bubbleSort(int[] a) {

        int i,j;
        for (i=0;i<a.length-1;i++) {//外层循环控制排序趟数
            for (j=0;j< a.length-1-i;j++) {//内层循环控制每一趟排序多少次
                if (a[j]>a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,78,45,66,53,27,8,64};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
