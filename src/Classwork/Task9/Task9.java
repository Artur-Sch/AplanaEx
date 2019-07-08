package Classwork.Task9;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Task - 9
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class Task9 {
    public static void main(String[] args){

        String filename = "test.txt";
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8)) {
            int x = -1;
            while ((x = in.read()) != -1) {
                System.out.print((char)x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
