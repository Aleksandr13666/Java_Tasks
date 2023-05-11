package com.example.seminar3.hw3;

public class Bookbase {
    private String book;
    private String author;
    private Double price;
    private Integer year;
    private Integer pages;

    public Bookbase(String book, String author, Double price,Integer year, Integer pages){
        this.book = book;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    public String getBook() {return book;}
    public String getAuthor() {return author;}
    public Double getPrice() {return price;}
    public Integer getYear() {return year;}
    public Integer getPages() {return pages;}
}
