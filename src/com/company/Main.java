package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sInt = new Scanner(System.in);
        Scanner sStr = new Scanner(System.in);


        System.out.println("Введите число:");
        int num = sInt.nextInt();                             // 1 задание
        if (num > 7) System.out.println("Привет");

        System.out.println("Введите имя:");
        String insertName = sStr.next();
        if (insertName.equals("Вячеслав"))
            System.out.println("Привет,Вячеслав");     // 2 задание
        else
            System.out.println("Нет такого имени");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);             // 3 задание
            if ( array[i] % 3 == 0) System.out.println(array[i]);
        }


    }
}
