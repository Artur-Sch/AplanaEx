package HomeWork.Task7;


/**
 * // Task7
 *
 * Вы едете слишком быстро, и полицейский останавливает вас. Напишите код для вычисления результата,
 * закодированный как значение типа int: 0 = нет штрафа, 1 = маленький штраф, 2 = большой штраф.
 * Если скорость равна 60 или меньше, результат равен 0. Если скорость находится между 61 и 80 включительно,
 * результат равен 1. Если скорость равна 81 или больше, результат равен 2.
 * Если это не ваш день рождения - в этот день ваш Скорость может быть на 5 выше во всех случаях.
 * Текущая дата задается рандомно, дата рождения вводится с клавиатуры.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день рождения в виде дд/мм");
        String bDate = scanner.nextLine();
        String currentDate = randomDate();
        boolean isBirthday = (bDate.equals(currentDate)) ? true : false;
        System.out.println("Дата вашего рождения: "+ bDate);
        System.out.println("Сегодня: "+ currentDate);
        System.out.println(overSpeedFine(65,isBirthday));
        System.out.println(overSpeedFine(75,isBirthday));
        System.out.println(overSpeedFine(85,isBirthday));
        System.out.println(overSpeedFine(64,isBirthday));
        System.out.println(overSpeedFine(54,isBirthday));
        System.out.println(overSpeedFine(82,isBirthday));
    }

    private static int overSpeedFine(int speed, boolean isBirthday) {
        int relief = (isBirthday) ? 5 : 0;
        if ((speed <= 60 + relief)) {
            return 0;
        } else if (speed <= 80 + relief) {
            return  1;
        }
        return 2;
    }

    private static String randomDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2019, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM");

        String result = randomDate.format(formatter);
        return result;
    }
}
