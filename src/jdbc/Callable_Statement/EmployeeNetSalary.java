package jdbc.Callable_Statement;

import java.sql.*;

public class EmployeeNetSalary {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT ID, LAST_NAME FROM EMP");

            while (rs.next()) {

                int id = rs.getInt("ID");
                String name = rs.getString("LAST_NAME");

                CallableStatement cs =
                        con.prepareCall("{call NETSALARY(?,?)}");

                cs.setInt(1, id);

                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                double netsalary = cs.getDouble(2);

                System.out.println(id + "  " + name + "  " + netsalary);

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}