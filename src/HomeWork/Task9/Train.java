package HomeWork.Task9;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Train implements Comparable<Train> {

    private String destination;
    private int number;
    private Calendar time;

    public Train(String destination, int number, Calendar time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YY HH:mm:ss");
        return "Поезд номер: " + number + "; в: " + destination + "; время отправления: " + format.format(time.getTime());
    }

    @Override
    public int compareTo(Train t) {
        int timeCompare = this.time.compareTo(t.time);
        if (timeCompare != 0) {
            return timeCompare;
        }
        int destCompare = this.destination.compareTo(t.destination);
        if (destCompare != 0)
            return destCompare;
        return Integer.compare(this.number, t.number);
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public Calendar getTime() {
        return time;
    }
}
