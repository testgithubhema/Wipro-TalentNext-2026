package jdbc.mini_project;

public class Scenario3 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.changeUserType("TA1002"));

    }

}