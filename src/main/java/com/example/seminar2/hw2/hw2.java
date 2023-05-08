package com.example.seminar2.hw2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantity of numbers: ");
        System.out.println();
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Input a number: ");
            array[i] = sc.nextInt();
        }
        boolean isSorted = array[0] < array[1];
        for (int i = 2; i < array.length ; i++) {
            if ( array[i - 1] <= array[i] && !isSorted){
                System.out.println("Not sorted.");
                return;
            }

        }
        System.out.println(isSorted? "Is sorted" : "Not sorted");
    }

}
