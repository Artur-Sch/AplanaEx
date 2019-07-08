package HomeWork.Task4;

/**
 *Task4
 * Пользователем с клавиатуры вводится два массива чисел,
 * размерность массивов задается пользователем (не менее 4 символов).
 * Программа должна выводить массив чисел, который состоит из середин двух массивов сложенных и перемешанных между собой.
 * (Длина середины должна быть не менее 50% от общей длины).
 *
 */

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers1;
        int[] numbers2;
        int[] result;
        System.out.println("Введите два массива чисел, не меньше четырех цифр в массиве");
        numbers1 = setArr();
        numbers2 = setArr();

        result = getArr(numbers1, numbers2);

        shuffle(result,random);
        System.out.println();
        for (int i : result) {
            System.out.print(i +" ");
        }

    }

    /**
     * ввод пользователем массива
     * @return
     */

    private static int[] setArr() {
        Scanner scanner = new Scanner(System.in);
        int[] result = null;
        String[] arr;
        while (true) {
            arr = scanner.nextLine().split("\\s+");
            if (arr.length > 3) {
                result = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
                break;
            } else {
                System.out.println("Не верное колличесто елементов, повторите ввод:");
            }
        }
        return result;
    }

    /**
     * получение массива из середин двух других массивов
     * @param arr1
     * @param arr2
     * @return
     */
    private static int[] getArr(int[] arr1, int[] arr2) {
        int avg1 = avg(arr1);
        int avg2 = avg(arr2);
        int[] result = new int[avg1 + avg2];
        System.arraycopy(arr1,avg1/2,result,0,avg1);
        System.arraycopy(arr2,avg2/2,result,avg1,avg2);
        return result;
    }

    /**
     * получение среднего индекса массива
     * @param arr
     * @return
     */
    private static int avg(int[] arr) {
        int avg = 0;
        if (arr.length % 2 == 1) {
            avg = arr.length / 2 + 1;
        } else {
            avg = arr.length / 2;
        }
        return avg;
    }

    /**
     * метод для перемешивания массива
     * @param arr
     * @param rnd
     */
    private static void shuffle(int[] arr, Random rnd) {
        int size = arr.length;
        for (int i = size; i > 1; i--) {
            swap(arr, i-1, rnd.nextInt(i));
        }
    }

    /**
     * метод перестановки элементов
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
