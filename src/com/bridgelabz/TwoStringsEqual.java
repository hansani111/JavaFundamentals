package com.bridgelabz;

import java.util.Scanner;

public class TwoStringsEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string first");
        String name1 = sc.next();
        System.out.println("enter string second");
        String name2 = sc.next();

        if(name1.equals(name2)){
            System.out.println("two strings are equal");
        }else{
            System.out.println("two strings are not equal");
        }
    }
}