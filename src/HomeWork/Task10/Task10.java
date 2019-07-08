package HomeWork.Task10;


/**
 * // Task10
 *
 * Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
 * Номер банковского счета; Конструктор; Методы: установка значений атрибутов, получение значений атрибутов,
 * вывод информации.Создать массив объектов данного класса. Вывести список покупателей в алфавитном порядке и
 * список покупателей, у которых номер кредитной карточки находится в заданном диапазоне.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class Task10 {

    public static void main(String[] args) {

        Bayer[] bayers = init();
        sortBayer(bayers);
        System.out.println("Список покупателей: ");
        for (Bayer bayer : bayers) {
            System.out.println(bayer);
        }
        System.out.println("---------------------------------------------------------------------------------");

        setRangeCardNumberAndPrintBayer(bayers);
    }

    /**
     * Метод выводит в консоль покупателей, чей номер карты находится в диапазоне заданоом пользователем.
     * @param bayers
     */
    private static void setRangeCardNumberAndPrintBayer(Bayer[] bayers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте нижнюю границу номера карты (16 цифр)");
        long minNum = scanner.nextLong();
        minNum = getNum(scanner, minNum);

        System.out.println("Задайте верхнюю границу номера карты");
        long maxNum = scanner.nextLong();
        maxNum = getNum(scanner, maxNum);

        System.out.println("Cписок покупателей с заданным диапазоном номера карты от: " + minNum + " до " + maxNum);
        for (Bayer bayer : bayers) {
            if ((bayer.getCreditCard() > minNum) && (bayer.getCreditCard() < maxNum)) {
                System.out.println(bayer.toString());
            }
        }
    }

    /**
     * метод для корректности воода числа
     * @param scanner
     * @param minNum
     * @return
     */
    private static long getNum(Scanner scanner, long minNum) {
        while (true) {
            if (minNum < 999999999999999L || minNum > 9999999999999999L) {
                System.out.println("Не верно указан номер, используйте 16 цифр");
                minNum = scanner.nextLong();
            }
            break;
        }
        return minNum;
    }

    /**
     * Инициализация массива Покупателей, номер карты и аккаунта банка, генерируются в методе класа Bayer
     * @return
     */
    private static Bayer[] init() {
        Bayer[] bayers = new Bayer[7];
        Random random = new Random();
        String[] sureNames = {"Иванов", "Петров", "Сидоров", "Пупкин"};
        String[] names = {"Иван", "Петр", "Василий", "Александр"};
        String[] petrs = {"Иванович", "Петрович", "Евгеньевич", "Андреевич"};
        for (int i = 0; i < bayers.length; i++) {
            bayers[i] = new Bayer(sureNames[random.nextInt(4)],
                    names[random.nextInt(4)],
                    petrs[random.nextInt(4)]);
        }
        return bayers;
    }

    /**
     * Сортировка по фамилии,
     * @param bayers
     */
    private static void sortBayer(Bayer[] bayers) {
        Arrays.sort(bayers, new Comparator<Bayer>() {
            @Override
            public int compare(Bayer o1, Bayer o2) {
                return o1.getSureName().compareTo(o2.getSureName());
            }
        });
    }
}
