package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = scanner.nextInt();
        System.out.println(subtract_Rez_And_Sum(a) );
        scanner.close();
    }

    /**
     * 
     * @param a - number
     * @return - number
     */

     
    public static int subtract_Rez_And_Sum(int a){

        
        int rez = 1;
        int sum = 0;
        while(a != 0) {
            rez *= a % 10;
            sum += a % 10;
            a /= 10;
        }
        return rez - sum;
    }
}
