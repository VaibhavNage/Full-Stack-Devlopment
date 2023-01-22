package jdbc;

import java.sql.*;

/**
 * mysql> delimiter /
 * mysql> create  procedure getStudentByNameAndCity(IN nm  varchar(10),IN c varchar(10))
 *     -> begin
 *     -> select  * from student where name = nm and city = c;
 *     -> end;
 *     -> /
 */

public class MySqlProcedureINParameter {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/java7sept";
        String username="root";
        String password="nage@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        CallableStatement cs= con.prepareCall("{call getStudentByNameAndCity(?,?)}");
        cs.setString(1,"Sapkal");
        cs.setString(2,"Dhule");
        ResultSet rs=cs.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }
        con.close();
    }
}
