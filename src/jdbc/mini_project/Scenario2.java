package jdbc.mini_project;

public class Scenario2 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.getIncorrectAttempts("AB1001"));

        System.out.println(dao.getIncorrectAttempts("TA1002"));

        System.out.println(dao.getIncorrectAttempts("RS1003"));

    }

}