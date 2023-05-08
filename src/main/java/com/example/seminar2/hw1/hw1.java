package com.example.seminar2.hw1;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/powx-n/
 */
public class hw1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i ++){
            int m = sc.nextInt();
            array[i] = m;
            sum = array[i] + array[i];
        }
        System.out.println(sum);
    }

    private static boolean primeNums(int n) {
        if (n == 2 || n == 3){
            return true;
        }
        else{
            if (n % 2 == 0) return false;
            for (int i = 3; i <= (n / 2)+1; i = i +2 ){
                if (n % i == 0)return false;
            }
            return true;
        }
    }
}


