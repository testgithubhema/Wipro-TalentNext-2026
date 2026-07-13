package collections.date_time_api;

import java.time.LocalTime;

public class Q_6 {
    public static void main(String[] args) {

        LocalTime current = LocalTime.now();
        LocalTime before = current.minusHours(5).minusMinutes(30);

        System.out.println("Current Time: " + current);
        System.out.println("Before 5 Hours 30 Minutes: " + before);
    }
}