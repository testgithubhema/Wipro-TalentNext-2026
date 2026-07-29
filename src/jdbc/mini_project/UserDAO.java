package jdbc.mini_project;

import java.sql.*;

public class UserDAO {

    // Scenario 1
    public String getUserType(String userID) {

        String type = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT USERTYPE FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                type = rs.getString("USERTYPE");

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return type;
    }

    // Scenario 2
    public String getIncorrectAttempts(String userID) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT INCORRECTATTEMPTS FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)

                    message = "No Incorrect Attempt";

                else if (attempts == 1)

                    message = "One Time";

                else

                    message = "Incorrect Attempt Exceeded";

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return message;
    }

    // Scenario 3
    public String changeUserType(String userID) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE USERS SET USERTYPE='Admin' WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            int i = ps.executeUpdate();

            if (i > 0)

                message = "Update Success";

            else

                message = "Update Failed";

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return message;
    }
 // Scenario 4
    public String getLockStatus(String userID) {

        String status = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT LOCKSTATUS FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                int lock = rs.getInt("LOCKSTATUS");

                if(lock == 0)

                    status = "Unlocked";

                else

                    status = "Locked";

            }

            con.close();

        }

        catch(Exception e) {

            e.printStackTrace();

        }

        return status;

    }
 // Scenario 5
    public String changeName(String userID, String newName) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE USERS SET NAME=? WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newName);
            ps.setString(2, userID);

            int i = ps.executeUpdate();

            if(i > 0)

                message = "Update Success";

            else

                message = "Update Failed";

            con.close();

        }

        catch(Exception e) {

            e.printStackTrace();

        }

        return message;

    }

}