package com.nh.zk.empty;

/**
 * com.nh.zk.empty
 * create by admin
 * create time 2020/9/27
 * version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        String str = "";
        String a = null;
        String b = new String();
        System.out.println(isEmpty(str));
        System.out.println(isEmpty(a));
        System.out.println(isEmpty(b));
    }

    private static boolean isEmpty(String str){
        if (str==null||str.equals("")||str.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
