package Classwork.Task14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Task14 Поиск максимального элемента в массиве.
 * Размерность массива задается пользователем.
 * Пользователем вводится массив строк.
 * В полученном массиве необходимо найти самое длинное и самое короткое слово, вывести оба в консоль.
 */
public class Task14 {


    public static void main(String[] args) throws IOException {
        int maxLength = 0, minLength = Integer.MAX_VALUE;
        String maxLengthWord = "";
        String minLengthWord = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива:");
        int length = Integer.parseInt(reader.readLine());

        String[] lines = new String[length];
        System.out.println("Введите массив строк");

        for (int i = 0; i < lines.length; i++) {
            lines[i] = reader.readLine();
            String[] words = lines[i].split("\\s+");
            for (String word : words) {
                if (maxLength < word.length()) {
                    maxLength = word.length();
                    maxLengthWord = word;
                }
                if (word.length() > 0 && minLength > word.length()) {
                    minLength = word.length();
                    minLengthWord = word;
                }
            }
        }

        System.out.println("Самое длинное слово - " + maxLengthWord + ", самое короткое - " + minLengthWord);
        reader.close();
    }
}
