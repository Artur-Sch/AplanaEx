package HomeWork.Task5;

// TODO: 08.07.2019

import java.util.Arrays;
import java.util.Scanner;

/**
 * Пользователем задается массив чисел и его размерность, если есть место для разбиения массива так,
 * чтобы сумма чисел на одной стороне была равна сумме чисел на другой стороне вывести на экран 2 массива (каждый из них одна
 * половина изначального массива) и суммы чисел итоговых массивов.
 */

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив чисел");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int avg = 0;
        if (arr.length % 2 == 1) {
            System.out.println("Не возможно поделить массив на 2 части, нечетное количество елементов");
        } else {
            avg = arr.length / 2;
        }
        int[] resultArr1 = new int[avg];
        int[] resultArr2 = new int[avg];

        System.arraycopy(arr,0,resultArr1,0,avg);
        System.arraycopy(arr,avg,resultArr2,0,avg);

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < avg; i++) {
            sum1 =+ resultArr1[i];
            sum2 =+ resultArr2[i];
        }
        System.out.println(Arrays.toString(resultArr1)+ ", сумма: " + sum1);
        System.out.println(Arrays.toString(resultArr2)+ ", сумма: " + sum2);
        if (sum1 == sum2) {
            System.out.println("Суммы равны!");
        }

    }


}
