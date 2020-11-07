package com.atguigu.test;

/**
 * TODO
 *
 * @ClassName: Test
 * @author: admin
 * @since: 2019/5/24 13:16
 */
public class Test {

    int foo(int n)
    {
        if(n<2) {
            return n;
        }
       int a=foo(n-1);
       int b=foo(n-2);
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(new Test().foo(5));
    }

}
