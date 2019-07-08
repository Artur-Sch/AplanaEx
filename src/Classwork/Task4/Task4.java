package Classwork.Task4;
import java.util.Scanner;

/**
 * Task - 4
 *  Вывести на экран таблицу умножения для введенного с клавиатуры числа.
 *  Нельзя использовать циклы
 *  В коде не должно быть цифр
 *  Привер ввода "5"
 *  Пример вывода:
 *  "5 * 1 = 5"
 *  "5 * 2 = 5"
 *  и т.д.
 */


public class Task4 {

    static int one;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        multiTab(a, one);
    }

    static void multiTab(int a, int b) {
        b++;
        int result = a * b;
        System.out.println(b + " * " + a + " = " + result);
        if (b < 9) {
            multiTab(a, b);
        }
    }
}
