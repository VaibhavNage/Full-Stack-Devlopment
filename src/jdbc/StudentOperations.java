package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentOperations {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/java7sept";
        String username="root";
        String password="nage@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Scanner sc=new Scanner(System.in);
        int ch;
        PreparedStatement ps= null;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show All");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    insertStudent(sc,ps,con);
                    break;
                case 2:
                    updateStudent(sc,ps,con);
                    break;
            }
        }while (ch<=5);
    }
    public static void updateStudent(Scanner sc,PreparedStatement ps,Connection con)throws SQLException{
        String updateQuery ="update student set name = ? where rno = ?;";
        ps =con.prepareStatement(updateQuery);
        System.out.println("Enter Roll No");
        ps.setInt(2,sc.nextInt());
        System.out.println("Enter Updated Name");
        ps.setString(1,sc.next());
        int n = ps.executeUpdate();
        System.out.println(n+" row/s updated");
    }
    public static void insertStudent(Scanner sc,PreparedStatement ps,Connection con)throws SQLException{
        String insertQuery ="insert into student values(?,?,?,?,?);";
        ps =con.prepareStatement(insertQuery);
        System.out.println("Enter Roll No");
        int rno= sc.nextInt();
        ps.setInt(1,rno);
        System.out.println("Enter Name");
        String name= sc.next();
        ps.setString(2,name);
        System.out.println("Enter Age");
        int age= sc.nextInt();
        ps.setInt(3,age);
        System.out.println("Enter Class");
        ps.setString(4, sc.next());
        System.out.println("Enter City");
        ps.setString(5, sc.next());
        int n = ps.executeUpdate();
        System.out.println(n+" row/s affected");
    }
}
