
// // inserting
// import java.sql.*;

// class Database {
//     Connection con;
//     Statement stm;

//     public Database(String url, String uname, String pwd) throws ClassNotFoundException, SQLException {
//         Class.forName("com.mysql.jdbc.Driver");
//         con = DriverManager.getConnection(url, uname, pwd);
//         stm = con.createStatement();
//     }

//     int insert_db(String query) throws SQLException {
//         // return rollno;
//     }

//     int delete_db(String query) throws SQLException {
//         // return rollno;
//     }

//     int update_db(String query) throws SQLException {
//         // return new_roll;
//     }

// }

// class jdbc2 {
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             Connection con = DriverManager.getConnection(
//                     "jdbc:mysql://localhost:3306/java_db",
//                     "root",
//                     "root12");

//             Statement sc = con.createStatement();
//             int x = sc.executeUpdate("insert into java_work values(12)");

//             System.out.println("insert successfull : " + x);

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
