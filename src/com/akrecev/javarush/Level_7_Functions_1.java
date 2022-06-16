package com.akrecev.javarush;

public class Level_7_Functions_1 {
    public static void main(String[] args) {
        printLine(10, "Пример вывода на печать ");
    }

    public static void print() {
        System.out.println("Тестовый метод печати print");
    }

    public static void printLine(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text + (i + 1));
        }
    }


}
