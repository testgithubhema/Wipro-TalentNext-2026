package jdbc.Prepared_Statements;

import java.sql.*;

public class Student1 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            String sql = "INSERT INTO STUDENT1 VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(args[0]));
            ps.setString(2, args[1]);
            ps.setString(3, args[2]);
            ps.setDate(4, Date.valueOf(args[3]));
            ps.setDouble(5, Double.parseDouble(args[4]));

            int i = ps.executeUpdate();

            if(i > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }

    }

}