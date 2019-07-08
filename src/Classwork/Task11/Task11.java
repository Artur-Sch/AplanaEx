package Classwork.Task11;
import java.util.Scanner;

/**
 * Task - 11
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(parseInt(a));
    }

    public static int parseInt(String s)  {
        int radix =2;
        int result = 0;
        boolean negative = false;
        int i = 0, len = s.length();
        int digit;
        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                }
                i++;
            }
            while (i < len) {
                digit = Character.digit(s.charAt(i++), radix);
                result *= radix;
                result -= digit;
            }
        }
        return negative ? result : -result;
    }
}
