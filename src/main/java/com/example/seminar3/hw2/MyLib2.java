package com.example.seminar3.hw2;

public class MyLib2 {
    private String name;
    private String country;
    private Double price;
    private Double weight;
    private Integer sort;

    public MyLib2(String name, String country, Double price, Double weight, Integer sort){
        this.name = name;
        this.country = country;
        this.price = price;
        this.weight = weight;
        this.sort = sort;
    }

    public String getName() {return name;}

    public String getCountry() {return country;}

    public Double getPrice() {return price;}

    public Double getWeight() {return weight;}

    public  Integer getSort() {return sort;}
}
