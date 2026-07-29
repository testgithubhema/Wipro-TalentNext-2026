package jdbc.mini_project;

public class Scenario1 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        String type = dao.getUserType("AB1001");

        System.out.println(type);

    }
}