package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //   int x = 1     x <= 1000     x = x + 2;
        //int x = 1;
       /* while( x <= 1000){
            System.out.println(x);
            x = x + 2;
        }*/

        for(int x= 10; x <= 60; x += 2){
            System.out.println(x);
        }
    }
}
