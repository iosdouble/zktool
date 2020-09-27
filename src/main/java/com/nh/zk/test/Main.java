package com.nh.zk.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        B b = new B();

    }
}
class A {
    static {
        System.out.println("父类静态方法 随着类创建");
    }
    public A(){
        System.out.println("父类构造方法在构造的时候被使用");
    }
}

class B extends A{
    static {
        System.out.println("子类静态方法随着子类被创建");
    }
    public B(){
        System.out.println("子类构造方法在子类构造过程中创建");
    }
}


