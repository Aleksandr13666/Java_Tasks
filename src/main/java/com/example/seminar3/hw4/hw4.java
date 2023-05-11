package com.example.seminar3.hw4;

/**
 * Задан целочисленный список ArrayList. Найти минимальное,
 * максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import  java.util.Random;
public class hw4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("Max: %d\n",max);
        System.out.printf("Min: %d\n",min);
        System.out.printf("Average: %.1f\n",((float)sum/arrlst.size()));
    }
}
