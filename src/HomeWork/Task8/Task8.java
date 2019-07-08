package HomeWork.Task8;

/**
 * // Task8
 * <p>
 * Создайте класс student, содержащую поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла.
 * Добавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
 */

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Student[] students = avgSortStudents(init(10));
/**
 * Для просмотра полного списка студентов, раскомментируй
 */
//        for (Student student : students) {
//            System.out.println(student.getName() + " "
//            +student.getGroup()+ " " + Arrays.toString(student.getRatings()) +" "+ student.getAvgRatings());
//        }
        printExcellentStudents(students);
    }

    /**
     * Вывод студентов с оценками 4 и 5
     * @param students
     */
    private static void printExcellentStudents(Student[] students) {
        for (Student student : students) {
            if (student.isExcellentStudent()) {
                System.out.println(student.toString());
            }
        }
    }

    /**
     * Сортировка студентов по среднему баллу
     * @param stud
     * @return
     */
    private static Student[] avgSortStudents(Student[] stud) {
        Student[] students = stud;
        Student tempStud;
        boolean isChanged = false;
        while (!isChanged) {
            isChanged = true;
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].getAvgRatings() > students[i + 1].getAvgRatings()) {
                    tempStud = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tempStud;
                    isChanged = false;
                }
            }
        }
        return students;
    }

    /**
     * Создание массива Students количеством amount
     * @param amount
     * @return
     */
    private static Student[] init(int amount) {
        Student[] students = new Student[amount];
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            students[i] = new Student("Василий" + i, random.nextInt(3) + 1, setRatings());
        }
        return students;
    }

    /**
     * Метод генерации массива оценок, для студента
     * Так то можно было перести в студента
     * @return
     */
    private static int[] setRatings() {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3) + 3;
        }
        return arr;
    }
}
