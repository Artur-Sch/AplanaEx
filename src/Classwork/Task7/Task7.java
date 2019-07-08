package Classwork.Task7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Task - 7 Светофор
 *  В начале каждого часа в течении 3х минут горит зеленый сигнал
 *  затем в течении одной минуты горит желтый
 *  затем в течении одной минуты горит красный
 *  затем опять зеленый горит 3 минуты и т.д.
 *  Ввести с клавиатуры число, означающее время в минутах, прошедшее с начала очередного часа.
 *  Определить сигнал какого цвета горит в данный момент.
 *  Вывод: Зеленый / Желтый / Красный
 */


public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());
        t = t % 5;
        if (t >= 0 && t < 3) {
            System.out.println("зелёный");
        } else if (t >= 3 && t < 4) {
            System.out.println("желтый");
        } else if (t >= 4 && t < 5) {
            System.out.println("красный");
        }
    }
}
