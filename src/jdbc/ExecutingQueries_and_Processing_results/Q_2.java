package jdbc.ExecutingQueries_and_Processing_results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q_2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT LAST_NAME, JOB, SAL, COMM FROM EMP " +
                           "WHERE SAL > 1000 AND SAL < 2000";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("LAST_NAME\tJOB\tSAL\tCOMM");

            while (rs.next()) {

                System.out.println(
                    rs.getString("LAST_NAME") + " " +
                    rs.getString("JOB") + " " +
                    rs.getDouble("SAL") + " " +
                    rs.getDouble("COMM")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}