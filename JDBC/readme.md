### JDBC

to connect java to databse i need these things.

1. choosing database.
2. we need database drivers.
3. set path of database driver


classes and interfaces for JDBC

1. improt java.sql.
2. downloaded databse drivers --> load -> register to memory.
to register any driver in java we will use a functon forName function.
(to connect specific databse we will form a connection to that particular databse.)
3. connection to a database. using connection interface (con) reference object. 

ex : 
connection con   = driver manager.getConnection("URL", "username","password")

4. Create the query.

5. execute the query.

6. process the result which is return from the database.

7. closing the connection.


it is present in  java.lang.Class

- Mysql

db1,db2

1) package
import java.sql.*

2) load & register
 class.forName("driverName) name of mySql driver : com.mysql.jdbc.driver

3) connection to a database. (so we need a manager who will manage the connection to database.)
   Connection con =     DriverManager.getConnection("URL","UserName", "password");

the connection interface is inside this java.sql

4) creating query 

i) single query (to create a query in java we have 2 interface)
    1. Statement interface
    2. prepared statement

ii) or i can use procedure for it we will use callable statement

5) Execute the query. 

6) process the result -> (after executing the query i will get some rows and columns which will store in some other interface which is known as ResultSet  )

7) 


pre

1. intall mysql
2. name of mysql
3. name of mysql database
4. username and password of mysql
5. driver download.
6. drivers in ide and installing driver. 
7.  