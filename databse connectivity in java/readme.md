### Database connectivity in java and SQl

# Java + MySQL (JDBC) — Command-line Step‑by‑Step README

This README walks you through a complete, practical workflow for connecting Java (plain command-line) to a MySQL 8.x database using the MySQL Connector/J (JAR). It covers project layout, compiling, running, common errors and fixes, and examples (insert + select). Designed for Windows PowerShell but the commands are easy to adapt for Linux/macOS.

---

## Overview

Goal: compile and run Java programs that talk to a local MySQL server using JDBC.

You will learn:

* Project layout and where to put the Connector/J `*.jar`
* How to compile and run with the JDBC driver on the classpath
* Basic `INSERT` and `SELECT` examples (Statement and PreparedStatement)
* How to set a permanent CLASSPATH or use a small batch file
* Troubleshooting (ClassNotFoundException, access denied, timezone errors, etc.)

---

## Prerequisites

* Java JDK installed (8+). `java -version` and `javac -version` should work.
* MySQL Server 8.x installed and running locally.
* MySQL Connector/J `mysql-connector-j-<version>.jar` downloaded.
* Basic familiarity with PowerShell / command prompt.

---

## Recommended project layout

```
D:\JAVA\databse connectivity in java\
  ├── lib\
  │     └── mysql-connector-j-9.4.0.jar
  └── src\
        ├── jdbc2.java      // your Java source
        └── ...
```

Put the connector JAR inside `lib` and your `.java` files inside `src`.

---

## 1) Create database and table (MySQL CLI)

Open MySQL CLI:

```bash
mysql -u root -p
```

Run these SQLs to create a test db + table:

```sql
CREATE DATABASE IF NOT EXISTS rishi;
USE rishi;

CREATE TABLE IF NOT EXISTS dup (
  stId INT PRIMARY KEY,
  name VARCHAR(100)
);
```

(If you want auto-increment: `stId INT PRIMARY KEY AUTO_INCREMENT`.)

---

## 2) Example Java code (recommended, uses PreparedStatement + try-with-resources)

Save this as `src/jdbc2.java`:

```java
import java.sql.*;

public class jdbc2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rishi?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root12"; // change as necessary

        String insertSql = "INSERT INTO dup (stId, name) VALUES (?, ?)";

        try {
            // optional since JDBC 4.0, but harmless
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, pass);
                 PreparedStatement ps = con.prepareStatement(insertSql)) {

                ps.setInt(1, 4);
                ps.setString(2, "aktk");

                int rows = ps.executeUpdate();
                System.out.println("Inserted rows: " + rows);

                // SELECT example
                try (Statement stmt = con.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT stId, name FROM dup")) {
                    while (rs.next()) {
                        System.out.println(rs.getInt("stId") + " - " + rs.getString("name"));
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Notes:

* Use `com.mysql.cj.jdbc.Driver` for MySQL Connector/J 8.x and newer.
* `serverTimezone=UTC` helps avoid timezone-related startup warnings.
* `useSSL=false` is convenient for local dev.

---

## 3) Compile (from the `src` folder)

Open PowerShell and `cd` into `src`:

```powershell
PS> cd "D:\JAVA\databse connectivity in java\src"
```

Then compile (relative path to the jar):

```powershell
PS> javac -cp "../lib/mysql-connector-j-9.4.0.jar;." jdbc2.java
```

* `-cp` tells the compiler where to find external classes.
* `.;` ensures the current directory is included.

If compile succeeds you should have `jdbc2.class` in `src`.

---

## 4) Run (include the JAR in the runtime classpath)

From the same `src` folder run:

```powershell
PS> java -cp ".;../lib/mysql-connector-j-9.4.0.jar" jdbc2
```

If everything is correct you should see `Inserted rows: 1` (or similar) and the SELECT output.

**Important:** specifying the JAR at runtime is necessary — compiling with `-cp` is not enough.

---

## 5) Alternate: compile/run from project root

If you want to compile from project root:

```powershell
PS> javac -cp "lib/mysql-connector-j-9.4.0.jar;." src\jdbc2.java
PS> java -cp "lib/mysql-connector-j-9.4.0.jar;src" jdbc2
```

This puts `src` on the runtime classpath so JVM can find your compiled classes.

---

## 6) Set CLASSPATH permanently (Windows)

If you prefer not to type `-cp` every time you can add a `CLASSPATH` system variable:

1. Right-click **This PC** → **Properties** → **Advanced system settings** → **Environment Variables**.
2. Under **System variables** click **New\...**.

   * Variable name: `CLASSPATH`
   * Variable value: `.;D:\JAVA\databse connectivity in java\lib\mysql-connector-j-9.4.0.jar`
3. OK → restart terminal.

After this you can run `java jdbc2` (provided your current working directory contains the `.class` or `src` is in CLASSPATH).

> Note: Many developers avoid global CLASSPATH and prefer explicit `-cp` or build tools (Maven/Gradle).

---

## 7) Batch file for convenience (example)

Create `runjdbc.bat` at project root with:

```bat
@echo off
pushd src
set CP=.;..\lib\mysql-connector-j-9.4.0.jar
javac -cp "%CP%" jdbc2.java
if errorlevel 1 goto :end
java -cp "%CP%" jdbc2
:end
popd
```

Run by double-clicking the batch or from PowerShell: `.
unjdbc.bat`.

---

## 8) Common errors & fixes

### `java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver`

* Cause: Connector JAR is not on the **runtime** classpath.
* Fix: Run with `-cp` including the jar, e.g.: `java -cp ".;../lib/mysql-connector-j-9.4.0.jar" jdbc2` or set CLASSPATH.
* Also verify the jar file actually exists at the path.

### `Access denied for user 'root'@'localhost' (using password: YES)`

* Cause: wrong username/password or host mismatch.
* Fix: Test credentials in MySQL CLI: `mysql -u root -p` and try the same user. Check `SELECT USER(), CURRENT_USER();`.
* If you need a separate user for the `rishi` DB:

  ```sql
  CREATE USER 'rishi'@'localhost' IDENTIFIED BY 'rishiPass';
  GRANT ALL PRIVILEGES ON rishi.* TO 'rishi'@'localhost';
  FLUSH PRIVILEGES;
  ```

### `The server time zone value '...' is unrecognized` or timezone warnings

* Fix: add `&serverTimezone=UTC` (or appropriate tz) to the JDBC URL: `jdbc:mysql://localhost:3306/rishi?useSSL=false&serverTimezone=UTC`

### `Communications link failure` / cannot connect

* Fixes:

  * Ensure MySQL service is running (Windows Services or `mysqld` process).
  * Check port (default 3306) is correct and not blocked by firewall.
  * Try `mysql -u root -p -h 127.0.0.1 -P 3306` to test connectivity.

---

## 9) Quick SQL helper commands

Inside MySQL CLI:

```sql
SELECT USER();          -- username@host for your current session
SELECT CURRENT_USER();  -- MySQL account used for authentication
SELECT user, host FROM mysql.user;  -- list all MySQL accounts (root required)
SHOW DATABASES;
SHOW TABLES;
DESCRIBE dup;
```

---

## 10) Short guide: Statement vs PreparedStatement

* `Statement` is simple but vulnerable to SQL injection and not parameterized.
* `PreparedStatement` allows parameter placeholders (`?`), is precompiled, and safer for user input.

Example insert with `PreparedStatement` (see code above).

---

## 11) Next steps / Improvements

* Move to a build tool (Maven or Gradle) to manage the connector dependency automatically.
* Use an IDE (IntelliJ/Eclipse) for easier debugging, auto classpath management, and auto-complete.
* If building a larger app, create a DAO layer, connection pooling (HikariCP), and proper exception handling.

---

## 12) Appendix: Quick reference commands

* Compile: `javac -cp "../lib/mysql-connector-j-9.4.0.jar;." jdbc2.java`
* Run: `java -cp ".;../lib/mysql-connector-j-9.4.0.jar" jdbc2`
* MySQL test login: `mysql -u root -p`

---

If you want, I can:

* create the runnable `runjdbc.bat` for your project,
* give a Maven `pom.xml` with the connector dependency,
* or produce a single downloadable `README.md` file (I can export it for you).

Happy coding — tell me which next step you want!
