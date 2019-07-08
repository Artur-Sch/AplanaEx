package HomeWork.Task2;

/**
 * // Task2
 *
 * Написать генерацию строк длины 10, причем первые 4 символа - цифры, следующие два символы - различные буквы,
 * следующие 4 символа - нули или единицы, причем одна единица точно присутствует.
 */

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        String randomString = generateRandomString();

        while (true) {
            if (randomString.contains("1") && randomString.lastIndexOf("1") > 5) {
                System.out.println(randomString);
                break;
            } else {
                randomString = generateRandomString();
            }
        }

    }

    public static String generateRandomString() {
        Random random = new Random();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String numbers = "0123456789";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                char ch = numbers.charAt(random.nextInt(numbers.length()));
                builder.append(ch);
            } else if (i > 3 && i < 6) {
                char ch = letters.charAt(random.nextInt(letters.length()));
                builder.append(ch);
            } else {
                char ch = numbers.charAt(random.nextInt(2));
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
