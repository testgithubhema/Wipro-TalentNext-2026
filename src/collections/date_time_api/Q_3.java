package collections.date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class Q_3 {
    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2020, 1, 1);
        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println("Years : " + p.getYears());
        System.out.println("Months: " + p.getMonths());
        System.out.println("Days  : " + p.getDays());
    }
}