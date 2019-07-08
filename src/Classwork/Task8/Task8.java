package Classwork.Task8;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Task - 8
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.
 */

public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "test.txt";
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(filename);
        String str = scanner.nextLine();
       while (!str.equals("стоп")) {
            writer.println(str);
           str = scanner.nextLine();
        }
       writer.close();
    }

}
