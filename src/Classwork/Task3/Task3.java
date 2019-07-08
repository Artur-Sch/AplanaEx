package Classwork.Task3;
import java.util.Scanner;

/**
 * Task - 3
 *  Написать метод
 *  Положительное или отрицательное число
 *  Ввести число с клавиатуры
 *  Если число положительное, то увеличить его в два раза
 *  Если число отрицательное, то прибавить к нему единицу
 *  Есди введенное число равно 0, то вывести на экран 0.
 */


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        if (calc(d) == 0.0) {
            System.out.println(0);
        } else System.out.println(calc(d));

    }

    static double calc(double v) {
        double res = 0;
        if (v > 0) {
            res = v * 2;
        } else if (v < 0) {
            res = v + 1;
        } else if (v == 0) {
            res = 0;
        }

        return res;
    }
}
