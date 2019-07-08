package HomeWork.Task3;

/**
 * // Task3
 *
 * Строка состоит из слов, разделенных одним или несколькими пробелами.
 * Переставьте слова по убыванию их длин.
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для сортировки слов:");
        String s = scanner.nextLine();
        String[] result = sortWords(s);
        for (String s1 : result) {
            System.out.print(s1 + " ");
        }

    }
    private static String[] sortWords(String s) {
        String[] words = s.split("\\s+");
        String temp;
        boolean isChanged = false;

        while (!isChanged) {
            isChanged = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    isChanged = false;
                }
            }
        }
        return words;
    }

}
