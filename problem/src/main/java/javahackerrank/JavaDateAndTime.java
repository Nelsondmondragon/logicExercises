package javahackerrank;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class JavaDateAndTime {

    public static void main(String[] args) {
        findDay(8,5,2015);
    }

    public static String findDay(int month, int day, int year) {
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, 0, 0);
        return dateTime.getDayOfWeek().toString();
    }


}
