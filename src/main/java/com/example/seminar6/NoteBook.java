package com.example.seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoteBook {
    private String manufacturer;
    private String model;
    private String color;
    private String os;
    private int ramSize;
    private int hddSize;
    private double price;

    public NoteBook(){

    }

    public NoteBook(String manufacturer, String model,
                    String color, String os, int ramSize,
                    int hddSize, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.os = os;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.price = price;
    }



    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<NoteBook> filters(Set<NoteBook>noteBooks){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert hdd drive volume: ");
        String hddVolume = sc.nextLine();
        int hddPars = Integer.parseInt(hddVolume);
        System.out.println("Insert memory volume: ");
        String ramVolume = sc.nextLine();
        int ramParse = Integer.parseInt(ramVolume);
        System.out.println("Insert OS: ");
        String isOS = sc.nextLine();

        List<NoteBook>noteBookList = new ArrayList<>();
        for(NoteBook tempNotebook : noteBooks){
            if(hddPars == tempNotebook.hddSize){
                if(ramParse == tempNotebook.ramSize){
                    if(isOS.equals(tempNotebook.os)){
                        noteBookList.add(tempNotebook);
                    }
                }
            }
        }
        return noteBookList;
    }

    public Set<NoteBook>newFilter(Set<NoteBook>noteBooks){
        Scanner sc = new Scanner(System.in);
        Set<NoteBook> noteBookSet = new HashSet<>(noteBooks);

        System.out.println("Insert numbers of filters " + "\n1. HDD \n2. Ram \n3. OS");
        String userChoise = sc.nextLine();

        for(int i = 0; i < userChoise.length(); i++){
            if(1 == Character.getNumericValue(userChoise.charAt(i))){
                System.out.println("Enter volume of HDD: 128, 256, 512");
                String hddVolume = sc.nextLine();
                int hddPars = Integer.parseInt(hddVolume);
                for(NoteBook tempNotebook : noteBooks){
                    if (hddPars != tempNotebook.hddSize){
                        noteBookSet.remove(tempNotebook);
                    }
                }
            }
            if(2 == Character.getNumericValue(userChoise.charAt(i))){
                System.out.println("Enter volume of Ram: 4, 8, 16");
                String ramVolume = sc.nextLine();
                int ramPars = Integer.parseInt(ramVolume);
                for(NoteBook tempNotebook : noteBooks){
                    if (ramPars != tempNotebook.ramSize){
                        noteBookSet.remove(tempNotebook);
                    }
                }
            }
            if(3 == Character.getNumericValue(userChoise.charAt(i))){
                System.out.println("Enter volume of OS: Linux, Windows, Mac");
                String isOs = sc.nextLine();
                for(NoteBook tempNotebook : noteBooks){
                    if ((isOs.equals(tempNotebook.os)) == false){
                        noteBookSet.remove(tempNotebook);
                    }
                }
            }

        }
        return noteBookSet;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
            "manufacturer='" + manufacturer + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", os='" + os + '\'' +
            ", ramSize=" + ramSize +
            ", hddSize=" + hddSize +
            ", price=" + price +
            '}';
    }
}
