package Classwork.Task10;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.util.Scanner;

/**
 * Task - 10
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */

public class Task10 {
    public static void main(String[] args) {
        String filename = "test.txt";
        Path file = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(file, Charset.forName("UTF-8"));
            for (String line : lines) {
                System.out.println(line);
            }

            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(filename);
            int i = lines.size();
            while (i != 0) {
                writer.println(scanner.nextLine());
                i--;
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
