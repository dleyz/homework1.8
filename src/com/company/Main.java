package com.company;

public class Main {
    //Задание 5
    public static void reverseArray (int [] reverseArray1) {
        for (int d = reverseArray1.length - 1; d >= 0; d--) {
            System.out.print(reverseArray1[d]);

        }
    }
    public static void example1 (String example){
        //Задание 4
        for (int i = 0; i < example.charAt(i); i++ ) {
            if (example.charAt(i) == example.charAt(i - 1))
                System.out.println(example.charAt(i));
            break;
        }

    }
    public static void deliveryDays1 (int deliveryDistance){
        //Задание 3
        int deliveryDays = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется" + deliveryDays + " дней.");
        }else if (deliveryDistance > 20 && deliveryDistance < 60){
            System.out.println("Потребуется" + deliveryDays + 1 + " дней.");
        }else if (deliveryDistance >=60 && deliveryDistance < 100){
            System.out.println("Потребуется" + deliveryDays + 2 + "дней");
        }else {
            System.out.println("Доставка в удаленные районы не совершается");
        }
    }
    public static void clientOs(int clientOs1, int clientDeviceYear) {
        //Задание 2
        if (clientOs1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по сыллке");
        }
        if (clientOs1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для iOS по сыллке");
        }

        }
        public static void years ( int year){
            //Задание 1
            if ((year % 400) == 0 || ((year % 100) != 0 && (year % 4) == 0)) {
                System.out.println(year + " год является висококосным.");
            } else {
                System.out.println(year + " год не является висококосным.");
            }
        }

        public static void main (String[]args){
            years(2045);
            clientOs(1,2010);
            deliveryDays1(30);
            example1(aabccddefgghiijjkk);
            reverseArray(3, 2, 1, 6, 5);


        }
    }
