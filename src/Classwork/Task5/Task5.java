package Classwork.Task5;
import java.util.Scanner;

/**
 * Task - 5
 *  Правило треугольника
 *  Ввести с клавиатуры 3 числа a,b,c - стороны предполагаемого треугольника
 *  Определить возможность существования треугольника
 *  Результат вывода:
 *  "Треугольник существует" или "Треугольник не существует"
 *  Подсказка:
 *  Треугольник существует только тогда, когда сумма двух любых его сторон больше третьей.
 */


public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
