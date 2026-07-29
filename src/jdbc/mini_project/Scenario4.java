package jdbc.mini_project;

public class Scenario4 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.getLockStatus("AB1001"));

        System.out.println(dao.getLockStatus("TA1002"));

        System.out.println(dao.getLockStatus("RS1003"));

    }

}