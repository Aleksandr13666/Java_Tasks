package com.example.seminar6;

/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий
 * (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Asus", "A56", "Green",
            "Linux", 8, 256, 58.000);
        NoteBook notebook2 = new NoteBook("Acer", "r8", "Black",
            "Windows", 16, 512, 32.000);
        NoteBook noteBook3 = new NoteBook("Apple", "Light", "Gray",
            "Mac", 4, 128, 15.000);
        Set<NoteBook> noteBookList = new HashSet<>();
        noteBookList.add(notebook1);
        noteBookList.add(notebook2);
        noteBookList.add(noteBook3);
        NoteBook FilterNotebook = new NoteBook();
        System.out.println(FilterNotebook.newFilter(noteBookList));
    }
}


