package jdbc.Prepared_Statements;

import java.sql.*;

public class StudentDelete {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            int roll = Integer.parseInt(args[0]);

            // Get student details
            String select = "SELECT * FROM STUDENT1 WHERE ROLLNO=?";

            PreparedStatement ps1 = con.prepareStatement(select);
            ps1.setInt(1, roll);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                // Store deleted student in log table
                String insert = "INSERT INTO STUDENTLOG1 VALUES(?,?,?,SYSDATE)";

                PreparedStatement ps2 = con.prepareStatement(insert);

                ps2.setInt(1, rs.getInt("ROLLNO"));
                ps2.setString(2, rs.getString("STUDENTNAME"));
                ps2.setString(3, rs.getString("STANDARD"));

                ps2.executeUpdate();

                // Delete student
                String delete = "DELETE FROM STUDENT1 WHERE ROLLNO=?";

                PreparedStatement ps3 = con.prepareStatement(delete);

                ps3.setInt(1, roll);

                int i = ps3.executeUpdate();

                if(i>0)
                    System.out.println("Student Deleted Successfully");
                else
                    System.out.println("Deletion Failed");

            }
            else {

                System.out.println("Student Not Found");

            }

            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }

    }

}