package jdbc.Prepared_Statements;

import java.sql.*;

public class StudentModify {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            String sql = "UPDATE STUDENT1 SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, Double.parseDouble(args[1]));
            ps.setInt(2, Integer.parseInt(args[0]));

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Fee Updated Successfully");
            else
                System.out.println("Student Not Found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}