package collections.date_time_api;

import java.time.LocalDate;

public class Q_4 {
    public static void main(String[] args) {

        int year = LocalDate.now().getYear();

        if (LocalDate.now().isLeapYear())
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}