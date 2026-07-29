package jdbc.Prepared_Statements;

import java.sql.*;

public class StudentDisplay {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            PreparedStatement ps;

            if (args.length == 0) {

                String sql = "SELECT * FROM STUDENT1";
                ps = con.prepareStatement(sql);

            } else {

                String sql = "SELECT * FROM STUDENT1 WHERE ROLLNO=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(args[0]));

            }

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                        rs.getInt("ROLLNO") + " " +
                        rs.getString("STUDENTNAME") + " " +
                        rs.getString("STANDARD") + " " +
                        rs.getDate("DATE_OF_BIRTH") + " " +
                        rs.getDouble("FEES"));

            }

            if (!found)
                System.out.println("No Records Found");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}