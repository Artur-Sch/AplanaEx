package Classwork.Task12;
import java.util.Random;

/**
 * Task12
 * Массив размерностью 20 чисел заполняется случайными целыми числами от -10 до 10 (Использовать рандомизатор).
 * Найти Максимальный положительный и отрицательный элемент массива, поменять их местами.
 */

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0, max = 0;

        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
        }

        int tempMaxInd = 0,tempMinInd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                tempMinInd = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                tempMaxInd = i;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Max = "+ max + "Min = "+ min);
        int temp;
        temp = arr[tempMaxInd];
        arr[tempMaxInd] = arr[tempMinInd];
        arr[tempMinInd] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
