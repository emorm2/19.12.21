package com.company;

public class Main {
    //1.  create array size 20 and  print the array

    // 2.Write a Java program to
    // sum values of an array.
    // (array has 10 values)
    public static void main(String[] args) {
                   //  0  1  2  3
       // int[] arr = new int[4];
      /*  System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);*/
        //             0 , 1 , 2 , 3, 4
       /* int array [] = {1, 2, 3, 4, 5};
        System.out.println(array.length);
        for(int i = 0; i <= array.length - 1; i ++ ){
            System.out.println(array[i]);
        }*/

       /* int[] array1 = new int[6];
        System.out.println(array1.length);
        System.out.println(array[0]);*/

      /*  int array[] = {2,4,6,8,10,12};
        for(int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }*/
        int arr[] = new int[10];
        int sum = 0;
        for(int i = 0 ; i <= arr.length; i++){
            arr[i] = i;
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
