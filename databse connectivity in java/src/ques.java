
//  taking values from user to get the name for column and roll no.
// connection programm

import java.io.*;
import java.sql.*;

class input {

    public int roll;
    public String name;

}

class a {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        input obj = new input();

        // System.out.println("Enter you value to add as roll no in the database.");
        // in the database.");
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter your  roll no");

            String st = br.readLine();
            int x = Integer.parseInt(st);
            System.out.println("Enter your  name ");
            String name = br.readLine();

            obj.roll = x;
            obj.name = name;
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("The roll is : " + obj.roll);
        System.out.println("The name is : " + obj.name);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    "root",
                    "root12");

            Statement sc = con.createStatement();

            int x = sc
                    .executeUpdate("insert into java_work (roll,name) values (" + obj.roll + ", '" + obj.name + "')"); // for

            System.out.println("insert successfull : " + x);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
