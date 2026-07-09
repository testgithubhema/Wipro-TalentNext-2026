package OOPS_inheritance.optional_class;
import java.util.Optional;
public class OptionalDemo {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println(employee.getEmpName());

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}