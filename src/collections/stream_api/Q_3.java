package collections.stream_api;

import java.util.ArrayList;

public class Q_3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1,"Ram",80));
        list.add(new Student(2,"Sam",45));
        list.add(new Student(3,"Ravi",60));
        list.add(new Student(4,"Ajith",30));
        list.add(new Student(5,"Kiran",75));

        long count = list.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}