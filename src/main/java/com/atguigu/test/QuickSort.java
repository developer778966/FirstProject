package com.atguigu.test;


import java.util.Arrays;

/**
 * TODO
 *
 * @ClassName: QuickSort
 * @author: admin
 * @since: 2020/8/12 14:16
 */
public class QuickSort {

    public static void quickSort(int[] a,int low,int high) {

        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(a,low,high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(a,low,index-1);
            quickSort(a,index+1,high);
        }
    }

    private static int getIndex (int[] a,int low,int high) {

        //将首个元素设为基准数据
        int key = a[low];

        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && a[high] >= key) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            a[low] = a[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && a[low] <= key) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            a[high] = a[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        a[low] = key;

        // 返回tmp的正确位置
        return low;
    }

    public static void main(String[] args) {

        int[] arr = {7,9,11,5,2,3,1,4,8,6,12,10};

        //搞了个10w的数组测试了下
        /*int[] brr = new int[100000];
        int i;
        for (i=0;i< 100000;i++) {
           brr[i] = (int)(Math.random()*99999+1);
        }
        long startTime = System.currentTimeMillis();
        quickSort(brr,0,brr.length-1);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(brr));
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");*/

        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));

        //纳秒
        long startTime = System.nanoTime();
        quickSort(arr,0,arr.length-1);
        long endTime = System.nanoTime();

        //1ms=1000微秒 1微秒等于1000ns
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }
}
