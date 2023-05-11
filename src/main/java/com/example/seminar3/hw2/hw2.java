package com.example.seminar3.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса,
 * цены, сорта. Получить наименования товаров заданного сорта
 * с наименьшей ценой.
 */
public class hw2 {
    public static void main(String[] args) {
        MyLib2 item1 = new MyLib2("Oil", "Russia", 68.0, 2.0, 2);
        MyLib2 item2 = new MyLib2("Bread", "Russia", 40.5, 0.7, 1);
        MyLib2 item3 = new MyLib2("Milk", "Russia", 89.0, 1.0, 1);
        MyLib2 item4 = new MyLib2("Apple", "Uzbekistan", 95.5, 1.0, 3);
        MyLib2 item5 = new MyLib2("Pineapple", "Kazakhstan", 155.0, 1.0, 2);
        MyLib2 item6 = new MyLib2("Peach", "China", 160.0, 1.0, 3);
        MyLib2 item7 = new MyLib2("Eggs", "Russia", 68.0, 10.0, 3);
        List<MyLib2> itemsList2 = new ArrayList<>();

        itemsList2.add(item1);
        itemsList2.add(item2);
        itemsList2.add(item3);
        itemsList2.add(item4);
        itemsList2.add(item5);
        itemsList2.add(item6);
        itemsList2.add(item7);
        System.out.println(itemsList2);
        int sorted = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag){
            System.out.println("Innput sort: ");
            String sort = sc.nextLine();
            if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3){
                flag = false;
                sorted = Integer.parseInt(sort);
            }
        }
        sc.close();

        double minPrice = itemsList2.get(0).getPrice();
        for(MyLib2 items : itemsList2){
            if (items.getSort().equals(sorted)){
                if (items.getPrice()<minPrice){
                    minPrice = items.getPrice();
                }
            }
        }
        StringBuilder names = new StringBuilder();
        for(MyLib2 items : itemsList2){
            if(items.getSort().equals(sorted) && (items.getPrice() == minPrice)){
                names.append(items.getName()).append("\n");
            }
        }
        System.out.println("Items of sort "+ sorted + " \nit's " + names);
    }
}
