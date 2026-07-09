package OOPS_inheritance.string_joiner_class;
import java.util.StringJoiner;
public class Q_2 {

	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Delhi");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Mumbai");
        s2.add("Pune");
        s2.add("Kolkata");


        StringJoiner result1 = new StringJoiner("-");
        result1.merge(s1);
        result1.merge(s2);
        System.out.println("s1 merged to s2 : " + result1);


        StringJoiner result2 = new StringJoiner("-");
        result2.merge(s2);
        result2.merge(s1);
        System.out.println("s2 merged to s1 : " + result2);

	}

}
