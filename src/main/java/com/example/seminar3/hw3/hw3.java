package com.example.seminar3.hw3;

import java.util.ArrayList;
import java.util.List;
public class hw3 {
    public static void main(String[] args) {
        Bookbase book1 = new Bookbase("Book1", "Amway", 320.0, 2013, 7);
        Bookbase book2 = new Bookbase("Book2", "Freeway", 420.0, 2013, 95);
        Bookbase book3 = new Bookbase("Book3", "Gets", 520.0, 2019, 7);
        Bookbase book4 = new Bookbase("Book4", "Amway", 30.0, 2022, 5);
        Bookbase book5 = new Bookbase("Book5", "Amway", 650.0, 2009, 659);
        Bookbase book6 = new Bookbase("Book6", "Amway", 980.0, 2002, 26);

        List<Bookbase> bookbaseList = new ArrayList<>();

        bookbaseList.add(book1);
        bookbaseList.add(book2);
        bookbaseList.add(book3);
        bookbaseList.add(book4);
        bookbaseList.add(book5);
        bookbaseList.add(book6);

        System.out.println(bookbaseList);

        StringBuilder sortBooks = new StringBuilder();
        for(Bookbase books : bookbaseList){
            if(isPrime(books.getPages()) && books.getAuthor().toLowerCase().contains("a")){
                if(books.getYear() >= 2010 && books.getYear()<=2023){
                    sortBooks.append(books.getBook()).append("\n");
                }
            }
        }
        System.out.println(sortBooks);
    }

    private static boolean isPrime(int n){
        if (n != 2 && n != 3) {
            if (n % 2 == 0) return false;
            for (int i = 3; i <= (n / 2) + 1; i = i + 2) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
