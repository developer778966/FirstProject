package com.atguigu.test;

import java.util.*;

/**
 * TODO
 *
 * @ClassName: RandomNumber
 * @author: admin
 * @since: 2020/7/30 18:37
 */
public class RandomNumber {

    public static void main(String[] args) {

        int i;
        int num;
        Set<Integer> set = new HashSet<>();

        //定义红球蓝球数组
        int [] red = new int[6];
        int [] blue = new int[1];

        //随机出6个不同数放入set集合
        blue[0] = (int)(Math.random()*15+1);
        while(set.size()< 6) {
            num = (int)(Math.random()*32+1);
            set.add(num);
        }

        //将set里面数字放入数组
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){

            for (i=0;i<6;i++){
                Integer next = iterator.next();
                red[i] = next;
            }
        }
        //给红球排个序
        RandomNumber.sort(red,6);
        System.out.println("红球随机数:" + Arrays.toString(red));
        System.out.println("蓝球随机数:" + Arrays.toString(blue));

    }

    public static void sort(int [] a, int n) {

        int i,j;
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                int tmp;
                if(a[j-1] > a[j]){
                    tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
