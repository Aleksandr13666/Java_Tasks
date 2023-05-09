package com.example.seminar3.hw1;
/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену
 * товаров 1го или 2го сорта среди товаров, название которых
 * содержит «высший».
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
public class Main1 {
    public static void main(String[] args) {
        MyLib item1 = new MyLib("Flour", 35.5, 2);
        MyLib item2 = new MyLib("Salt", 15.5, 3);
        MyLib item3 = new MyLib("Sugar top grade", 45.0, 1);
        MyLib item4 = new MyLib("Bread top grade", 40.0, 1);

        List<MyLib>myLibList = new ArrayList<>();
        myLibList.add(item1);
        myLibList.add(item2);
        myLibList.add(item3);
        myLibList.add(item4);

        String search = "top";
        Double maxPrice = 0.0;
        String maxPriceName = "";

        for (MyLib items : myLibList){
            if (items.getName().toLowerCase().contains(search) && (items.getSort() == 1 || items.getSort() == 2)){
                if(maxPrice < items.getPrice()){
                    maxPrice = items.getPrice();
                }
            }
        }
        for(MyLib items : myLibList){
            if(items.getName().toLowerCase().contains(search) && (items.getSort() == 1 || items.getSort() == 2)){
                if(Objects.equals(items.getPrice(), maxPrice)){
                    maxPriceName += items.getName()+"\n";
                }
            }
        }
        System.out.println("Items 1st and 2nd sort with TOP grade: ");
        System.out.println(maxPriceName);
        System.out.println(maxPrice);
    }
}
