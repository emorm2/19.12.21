package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 1. write a program that takes value from user until he
        // prints Negative number, and print at the end the sum of
        // the numbers.
        System.out.println("Please enter a number: ");
        int num = s.nextInt();
        int sum=0;

        while(num > 0 ){  //
            sum = sum + num;  ///
            System.out.println("enter another number: ");
            num = s.nextInt();
        }
        System.out.println("sum is:  " + sum);
    }
}
