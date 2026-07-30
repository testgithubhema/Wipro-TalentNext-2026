package jdbc.mini_project;

public class JDBCCalls {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        String[] names = dao.getNames();

        for (String name : names) {

            if (name != null) {
                System.out.println(name);
            }

        }
    }
}