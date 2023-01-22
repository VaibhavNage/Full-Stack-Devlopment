package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUpdate {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java7sept";
        String username="root";
        String password="nage@123";
        String updateQuery="update student set class = 'Bsc' where name = 'Vaibhav';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement= con.prepareStatement(updateQuery);
            int n=preparedStatement.executeUpdate();
            System.out.println(n+" row/s updated");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
