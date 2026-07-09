package OOPS_inheritance.string_joiner_class;
import java.util.ArrayList;
import java.util.StringJoiner;
public class Q_1 {
	 public static void main(String[] args) {

	        ArrayList<String> names = new ArrayList<>();

	        names.add("Ram");
	        names.add("Sita");
	        names.add("Ravi");
	        names.add("Krishna");

	        StringJoiner sj = new StringJoiner(",", "{", "}");

	        for (String name : names) {
	            sj.add(name);
	        }

	        System.out.println(sj);
	    }

}
