package jdbc;

import java.sql.*;

public class MySqlBatchProcessingDemo {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/java7sept";
        String username="root";
        String password="nage@123";
        String insertQuery1="insert into student values(5,'Suryavanshi',10,'ITI','Manhatan');";
        String insertQuery2="insert into student values(6,'Sapkal',20,'MBA','Dhule');";
        String insertQuery3="insert into student values(7,'Kute',70,'MBBS','Nalasopara');";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement statement=con.createStatement();
        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);
        System.out.println("statement.executeBatch() :"+statement.executeBatch());
        con.close();
    }
}

        