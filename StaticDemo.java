package com.bridgelabz.basics;

public class StaticDemo {
    static int x=10;
    static  int y;
    static void func(int z){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
    static {
        System.out.println("Running static block");
        y=y+5;
    }

    public static void main(String[] args) {
        func(7);
    }
}
