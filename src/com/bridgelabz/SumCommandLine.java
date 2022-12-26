package com.bridgelabz;

public class SumCommandLine {

    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int i=0; i<args.length; i++) {
            try {
                sum = sum + ( Integer.parseInt(args[i]) );
            }catch (NumberFormatException e) {
                count ++;
            }
        }
        System.out.println("Total count of non integer value (invalid integer) = " + count);
        System.out.println("Sum of integer numbers is (valid integer sum) = " + sum);
    }
}