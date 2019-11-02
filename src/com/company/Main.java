package com.company;

public class Main {

    public static void main(String[] args) {

        if (1>0) {
            System.out.println("Один больше нуля");
            System.out.println("Java");
            if (-9 > 0) { // вложенная условная конструкция if
                System.out.println("Минус девять больше нуля");

            }
            final int temperature = 50;
            //
            boolean isRainy = false;
            if (temperature > 40) {
                System.out.println("Лучше остаться дома");
            } else if (isRainy) {
                System.out.println("Необходимо взять зонт");
            } else {
                System.out.println("Можно идти гулять");
            }

            String tx = "Привет";

            System.out.println(tx);
        }
    }
}
