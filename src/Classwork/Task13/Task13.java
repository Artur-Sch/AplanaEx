package Classwork.Task13;


/**
 * Task13
 * Реализовать базовые операции калькулятора (+ | - | / | *).
 * Операции разнести по отдельным методам. Упаковать программу в исполняемый jar.
 * Должна запускаться по принципу java -jar * 1 2. Выводить результат в консоль.
 */

public class Task13 {

    public static void main(String[] args) {
        if (args.length == 3) {
            double a = Double.parseDouble(args[1]);
            double b = Double.parseDouble(args[2]);
            double result = 0;

            switch (args[0]) {
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
                    result = a / b;
                    break;
                default:
                    System.out.println("Не правильный ввод! Например: * 2 5");
                    break;
            }
            System.out.println(result);
        } else if (args.length > 3) {
            double a = Double.parseDouble(args[args.length-2]);
            double b = Double.parseDouble(args[args.length-1]);
            double result = a * b;
            System.out.println(result);
        } else {
            System.out.println("Не верный ввод!");
        }
    }
}

