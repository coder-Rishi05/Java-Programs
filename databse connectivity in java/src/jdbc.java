import java.sql.*;

class jdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root", // ✅ just the username
                    "root12" // ✅ your password
            );

            // Statement sc = con.createStatement();
            // int x = sc.executeUpdate("desc java_work");

            System.out.println("setup conection ");
            // System.out.println(x);
            // con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// for connectivity and inserting the data

// PS D:\JAVA\databse connectivity in java\src> javac -cp "
// ../lib/mysql-connector-j-9.4.0.jar;."jdbc.java
// // PS D:\JAVA\databse connectivity in java\src> java -cp
// "../lib/mysql-connector-j-9.4.0.jar;." jdbc2