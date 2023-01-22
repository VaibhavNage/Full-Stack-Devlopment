package jdbc;

import java.sql.*;

/**
 * mysql> create  procedure get_max_age(OUT maxage int)
 *     -> begin
 *     -> select MAX(age) into maxage from student;
 *     -> end;
 *     ->  /
 *
 *     mysql> call get_max_age(@A);
 *     -> /
 * Query OK, 1 row affected (0.00 sec)
 *
 * mysql> select @A;
 *     -> /
 * +------+
 * | @A   |
 * +------+
 * |   70 |
 * +------+
 */

public class MySqlOutParameterProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/java7sept";
        String username = "root";
        String password = "nage@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement cs = con.prepareCall("{call get_max_age(@A)};");
        ResultSet rs = cs.executeQuery();
        cs.setInt(1,2);
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
        }
        con.close();
    }
}
