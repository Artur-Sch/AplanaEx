package Classwork.Task2;

import java.util.Scanner;


/**
 *  Task - 2
 *  Написать два метода.
 *  Первый метод должен по номеру месяца определить время года (зима, весна, лето, осень) с помощью if else.
 *  Второй метод цель аналогичная первому, но реализован с помощью switch
 *  Номер месяца вводится с клавиатуры
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int res = scanner.nextInt();

        method1(res);
        method2(res);
    }

    static void method1(int res) {
        switch (res) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("не верный месяц");
                break;
        }
    }

    static void method2(int res) {
        if (res == 12 || res == 1 || res == 2) {
            System.out.println("Зима");
        } else if (res >= 3 && res <= 5) {
            System.out.println("Весна");
        } else if (res >= 6 && res <= 8) {
            System.out.println("Лето");
        } else if (res >= 9 && res <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Не правильное число");
        }
    }
}
