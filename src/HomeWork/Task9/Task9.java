package HomeWork.Task9;

/**
 * // Task9
 * Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления.
 * Ввести данные в массив из пяти элементов типа train, упорядочить элементы по номерам поездов.
 * Добавить возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавить возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */


import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Train[] trains = initRandom();

        TrainComparator comparator = new TrainComparator();
        comparator.setTrainsCompareMethods(TrainComparator.TrainsCompareMethods.BY_NUMBER);

        Arrays.sort(trains, comparator);
        System.out.println("Поезда по номерам");
        for (Train train : trains) {
            System.out.println(train.toString());
        }

//        printTrainForUser(trains);
//        System.out.println();

        sortTrainDest(trains, comparator);
        System.out.println("Поезда по городу отправления");

        for (Train train : trains) {
            System.out.println(train);
        }


    }

    /**
     * Сортировка массива по пункту назачения, с учетом времени отправления
     *
     * @param trains
     * @param comparator
     */
    private static void sortTrainDest(Train[] trains, TrainComparator comparator) {
        comparator.setTrainsCompareMethods(TrainComparator.TrainsCompareMethods.BY_DEST);
        Arrays.sort(trains, comparator);
        Train tempStud;
        boolean isChanged = false;
        while (!isChanged) {
            isChanged = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getDestination().equals(trains[i + 1].getDestination())) {
                    if (trains[i].getTime().getTimeInMillis() > trains[i + 1].getTime().getTimeInMillis()) {
                        tempStud = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = tempStud;
                        isChanged = false;
                    }
                }
            }
        }
    }


    /**
     * Вывод информации о поезде по номеру введенному пользователем
     *
     * @param trains
     */
    private static void printTrainForUser(Train[] trains) {
        System.out.println("Введите номер поезда или напишите отмена");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (!s.equals("отмена")) {
            int numberUser = Integer.parseInt(s);
            for (Train train : trains) {
                if (train.getNumber() == numberUser) {
                    System.out.println(train);
                }
            }
        }
    }

    /**
     * Заполнение массива
     *
     * @return
     */
    private static Train[] init() {
        Train[] trains = new Train[5];
        trains[0] = new Train("Москва", 67, randomTime());
        trains[1] = new Train("Берлин", 12, randomTime());
        trains[2] = new Train("Москва", 124, randomTime());
        trains[3] = new Train("Москва", 78, randomTime());
        trains[4] = new Train("Караганда", 176, randomTime());
        return trains;
    }

    private static Train[] initRandom() {
        Random random = new Random();
        int tr = (int) (Math.random()*15)+1;
        Train[] trains = new Train[tr];
        String[] citys = {"Москва", "Берлин", "Хабаровск", "Мурманск", "Новосибирск", "Караганда", "Ташкент"};
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train(citys[random.nextInt(7)], (int) (Math.random() * 100), randomTime());
        }
        return trains;
    }


    /**
     * Рандомное время отправления, с датой 08.07.2019
     *
     * @return
     */
    private static Calendar randomTime() {
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(2019, Calendar.JULY, 8, random.nextInt(24), random.nextInt(60), 0);
        return calendar;
    }

}
