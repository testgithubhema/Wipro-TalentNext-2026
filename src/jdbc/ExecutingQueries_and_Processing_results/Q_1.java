package jdbc.ExecutingQueries_and_Processing_results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q_1 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

            System.out.println("ID\tLAST_NAME");

            while(rs.next()) {

                int id = rs.getInt(1);                    
                String lname = rs.getString("LAST_NAME"); 

                System.out.println(id + "\t" + lname);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }

    }
}