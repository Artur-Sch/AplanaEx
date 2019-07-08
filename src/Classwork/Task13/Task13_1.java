package Classwork.Task13;

import java.util.Scanner;

/**
 * Task13
 * Реализовать базовые операции калькулятора (+ | - | / | *).
 *
 */

public class Task13_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражение, ввида \"* 1 2\". Для завершения введите \"стоп\"");

        String operation = scanner.nextLine();

        while (!operation.startsWith("стоп")) {
            int a = Integer.parseInt(operation.split(" ")[1]);
            int b = Integer.parseInt(operation.split(" ")[2]);
            int result = 0;
            switch (operation.split(" ")[0]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("На ноль делить нельзя!");
                    }
                    break;
                default:
                    System.out.println("Не правильный ввод! Например: * 2 5");
                    break;
            }
            System.out.println(result);
            operation = scanner.nextLine();
        }



    }
}
