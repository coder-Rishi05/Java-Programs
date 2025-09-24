// connection programm

import java.sql.*;

class a {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root", // ✅ just the username
                    "root12" // ✅ your password
            );

            Statement sc = con.createStatement();
            int a = 3;
            String st = "harry";
            int x = sc.executeUpdate("insert into java_work values (" + 1 +a + 2 +st + ")");

            System.out.println("insert successfull : " + x);
            // ResultSet rs = sc.executeQuery("SELECT * FROM java_work");
            // while (rs.next()) {
            // System.out.println(rs.getInt("roll") + " | " +
            // rs.getString("name"));
            // }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// taking values from user to get the name for column and roll no.