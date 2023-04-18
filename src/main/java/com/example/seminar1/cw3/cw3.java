package com.example.seminar1.cw3;
/*Дана строка, поменять местами её половины. */

public class cw3 {
    public static void main(String[] args){
    System.out.println(replacePartOfString("I walk through the valley of the shadow..."));
}

public static String replacePartOfString(String str){
    int len = str.length();
    String sub1 = str.substring(0, len / 2);
    String sub2 = str.substring(len /2, len);
    return sub2 + sub1;
}
}
