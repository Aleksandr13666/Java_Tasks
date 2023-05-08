package com.example.seminar2.hw3;

public class replaceMethod {
    public static int findTwoDigitsIndexMethod(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            if (tmp < 0) {
                tmp *= -1;
            }
            if (tmp > 9 && tmp <= 99) {
                sum += i;
            }
        }
        return sum;
    }

    public static int[] replaceR(int[] array, int temp) {
        int[] myArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                myArray[i] = temp;
            } else {
                myArray[i] = array[i];
            }
        }
        return myArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
    }
}
