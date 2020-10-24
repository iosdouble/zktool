package com.nh.zk.stringtest;

/**
 * com.nh.zk.stringtest
 * create by admin
 * create time 2020/10/10
 * version 1.0
 **/
public class StringTest {
    public static void main(String[] args) {
        String builder = new StringBuilder().append("Ja").append("va").toString();
        String bu = new StringBuffer().append("test").append("test").toString();

        String s1 = new String("Java");

        String s2 = builder.intern();

        System.out.println(s1==builder);
    }
}
