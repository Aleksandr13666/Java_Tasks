package com.example.seminar1.cw2;

import java.util.Scanner;

public class cw2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.println(countDiff(n, scanner));
    }

    /**
     * 
     * @param n
     * @param scanner
     * @return
     */

    public static int countDiff(int n, Scanner scanner){
        int count = 0;
    int a = scanner.nextInt();
    for (int i = 0; i < n - 1; i++) {
        int b = scanner.nextInt();
        if (a > 0 && b < 0){
            count++;
        }
        a = b;
    }
    scanner.close();
    return count;
    }
}
