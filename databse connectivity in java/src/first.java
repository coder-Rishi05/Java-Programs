import java.sql.*;

class jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rishi",
                    "root", // ✅ just the username
                    "root12" // ✅ your password
            );

            Statement sc = con.createStatement();
            int x = sc.executeUpdate("insert into dup values (4112, rishabh )");

            System.out.println("Inserted a query : ");
            System.out.println(x);
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
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
