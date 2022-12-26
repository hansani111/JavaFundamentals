package com.bridgelabz;

public class StaticVarMethodBlock {
    static int variable = 10;
    static int variable1 = 20;

    static void  staticMethods(){
        int var = variable +variable1;
        System.out.println("sum of two static variable : " +var);
    }

    static {
        System.out.println("this is a static block");
    }

    public static void main(String[] args) {
        System.out.println("----demonstrate static variables, methods, and blocks-----");
        System.out.println("static variable : "+variable);
        staticMethods();
    }
}