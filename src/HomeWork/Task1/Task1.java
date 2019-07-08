package HomeWork.Task1;
/**
 * Task1
 * * Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.
 * * Слова вводятся пользователем.
 */

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова для проверки через пробел:");
        String words = scanner.nextLine();
        char[] word1 = words.toLowerCase().split("\\s+")[0].toCharArray();
        HashSet<Character> word1Set = new HashSet<>();
        char[] word2 = words.toLowerCase().split("\\s+")[1].toCharArray();
        HashSet<Character> word2Set = new HashSet<>();
        oneChar(word1,word1Set);
        oneChar(word2,word2Set);
        word1Set.retainAll(word2Set);
        for (Character character : word1Set) {
            System.out.print(character + " ");
        }

    }

    public static void oneChar(char[] arrChat, HashSet<Character> set) {
        int count = 0;
        for (int i = 0; i < arrChat.length; i++) {
            for (int j = 0; j < arrChat.length; j++) {
                if (arrChat[i] == arrChat[j] && i != j) {
                    count++;
                }
            }
            if (count < 1) {
                set.add(arrChat[i]);
            } else {
                count = 0;
            }
        }
    }

}
