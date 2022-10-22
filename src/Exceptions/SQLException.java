package Exceptions;
import java.sql.*;
//Write a program to generate SQLException
public class SQLException {
    public static void main(String[] args) throws ClassNotFoundException, java.sql.SQLException {
        Connection con = null;
        ResultSet res = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
                "root","");
    }
}
