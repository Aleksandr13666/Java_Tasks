package com.example.seminar2.hw3;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы
 * на сумму индексов двузначных элементов массива.
 */
public class hw3 {
    public static void main(String[] args) {
        int array[] = new int[]{1, 3 , -5, 15, 25};
        int sum = replaceMethod.findTwoDigitsIndexMethod(array);
        int[]newArray = replaceMethod.replaceR(array, sum);
        replaceMethod.printArray(newArray);

    }
}
