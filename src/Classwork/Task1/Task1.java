package Classwork.Task1;

import java.util.Scanner;


/**
 *  Task - 1
 *  Написать метод.
 *  Метод должен выводить на экран ближайшее к 10 из двух введеных чисел, записанных в аргумент метода.
 *  Числа могут быть любого типа.
 *  Числа вводятся с клавиатуры.
 */


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 10;

        double m = scanner.nextDouble();
        double n = scanner.nextDouble();

        double r1 = Math.abs(m - num);
        double r2 = Math.abs(n - num);
        if (r1 == r2) {
            System.out.println(m);
        } else if (r1 < r2) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }



    }

}
