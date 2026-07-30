package jdbc.mini_project;

public class Scenario7 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println(
                dao.addUser(
                        "VK1004",
                        "VK1004",
                        "Vikram",
                        0,
                        0,
                        "Employee"));

    }

}