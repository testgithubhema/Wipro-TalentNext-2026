package collections.date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q_2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }

        date = date.plusDays(7);

        System.out.println("Second Sunday of next month: " + date);
    }
}