import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

class jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // updated path for sql 8.0 version.
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rishi", "root", "root12");

    }
}

// complete path for the jar and java file. will work if both files are on
// diffrent location

// javac -cp
// "C:\Users\DELL\Downloads\mysql-connector-j-9.4.0\mysql-connector-j-9.4.0.jar;."
// "D:\JAVA\databse connectivity in java\first.java"

// will work if both file on same location

// javac -cp
// "C:\Users\DELL\Downloads\mysql-connector-j-9.4.0.jar;D:\JAVA\databse
// connectivity in java" first

// import java.sql.*;

// class jdbc1 {
// public static void main(String[] args) throws ClassNotFoundException,
// SQLException {
// try {
// // Load MySQL Driver
// Class.forName("com.mysql.cj.jdbc.Driver");

// // Connect
// Connection con = DriverManager.getConnection(
// "jdbc:mysql://localhost:3306/rishi?useSSL=false&serverTimezone=UTC",
// "root",
// "root12"
// );

// System.out.println("✅ Connection Successful!");
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
