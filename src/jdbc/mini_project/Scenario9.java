package jdbc.mini_project;

public class Scenario9 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.displayUser("AB1001"));

    }

}