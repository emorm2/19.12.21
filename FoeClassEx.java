package com.company;

import java.util.Scanner;

public class Main {
    // 1.Write loop to print numbers from 20 – 2000 in jumps of 5.
    // 2.Write loop to sum numbers from 1-20.

    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);*/
        for(int y = 20; y <= 2000; y+=5 ){
            System.out.println(y);
        }
        System.out.println("================");
        int sum = 0;
        for(int num = 0; num <= 20; num ++){
            sum = sum +  num;
        }
        System.out.println(sum);
    }
}
