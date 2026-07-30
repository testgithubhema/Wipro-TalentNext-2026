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
 // Scenario 6
    public String changePassword(String userID, String newPassword) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE USERS SET PASSWORD=? WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newPassword);
            ps.setString(2, userID);

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
 // Scenario 7
    public String addUser(String userID, String password, String name,
                          int incorrectAttempts, int lockStatus, String userType) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO USERS VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setInt(4, incorrectAttempts);
            ps.setInt(5, lockStatus);
            ps.setString(6, userType);

            int i = ps.executeUpdate();

            if (i > 0)

                message = "Insert Success";

            else

                message = "Insert Failed";

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return message;

    }
 // Scenario 8
    public String deleteUser(String userID) {

        String message = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            int i = ps.executeUpdate();

            if (i > 0)

                message = "Delete Success";

            else

                message = "Delete Failed";

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return message;

    }
 // Scenario 9
    public String displayUser(String userID) {

        String details = "";

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                details = rs.getString("USERID") + " "
                        + rs.getString("PASSWORD") + " "
                        + rs.getString("NAME") + " "
                        + rs.getInt("INCORRECTATTEMPTS") + " "
                        + rs.getInt("LOCKSTATUS") + " "
                        + rs.getString("USERTYPE");

            } else {

                details = "User Not Found";

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return details;

    }

}