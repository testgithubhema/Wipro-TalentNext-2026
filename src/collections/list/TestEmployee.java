package collections.list;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                45000);

        Employee e2 = new Employee(102,
                "Priya",
                "priya@gmail.com",
                "Female",
                50000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.getEmployeeDetails();
        System.out.println();

        System.out.println(db.showPaySlip(101));

        System.out.println();

        System.out.println("Deleted : " + db.deleteEmployee(102));
    }
}