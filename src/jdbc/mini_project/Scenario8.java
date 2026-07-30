package jdbc.mini_project;

public class Scenario8 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(dao.deleteUser("VK1004"));

    }

}