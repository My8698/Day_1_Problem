package com.bridgelabz.basics;
public class StaticMethodDemo {
    static int x=10;
    static  int y;
    static void function(int z){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
    static {
        System.out.println("Running static block");
        y=y+5;
    }
    public static void main(String[] args) {
        function(7);
    }
}
