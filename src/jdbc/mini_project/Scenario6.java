package jdbc.mini_project;

public class Scenario6 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.changePassword("RS1003", "RS9999"));

    }

}