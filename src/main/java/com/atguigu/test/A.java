package com.atguigu.test;

/**
 * TODO
 *
 * @ClassName: A
 * @author: admin
 * @since: 2020/8/1 15:15
 */
public class A {
    public A(){
        System.out.print("A gouzao");
    }
    private static A a=new A();
    static{
        System.out.print("static");
    }
    {
        System.out.print("A1.0");
    }
}
class B extends A{
    public B(){
        System.out.print("B");
    }
    public static void main(String[] args) {
        //System.out.println("0000");
        B b=new B();
    }
}
