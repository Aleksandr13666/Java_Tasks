package com.example.seminar1.hw2;

import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            int x = sc.nextInt();
            if (x != 0) n += x;
            else break;

        }
        System.out.println(n);
        sc.close();
    }
}
