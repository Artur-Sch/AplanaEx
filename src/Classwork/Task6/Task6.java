package Classwork.Task6;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Task - 6
 *  Ввести с клавиатуры три числа
 *  Отсортировать по возрастанию
 *  Отсортировать по убыванию
 *  Ввод: 16 43 23 вывод: 16 23 43 : 43 23 16
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);
        for (int i : numArr) {
            System.out.print(i + " ");
        }
        System.out.print(" : ");
        reverse(numArr);
        for (int i : numArr) {
            System.out.print(i +" ");
        }
    }
    public static void reverse(int[] arr) {
        if (arr == null) {
            return;
        }
        int i = 0;
        int j = arr.length - 1;
        int tmp;
        while (j > i) {
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            j--;
            i++;
        }
    }
}
