package jdbc.mini_project;

public class Scenario5 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.changeName("TA1002", "Ramesh"));

    }

}