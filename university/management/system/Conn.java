package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.DriverManager;

public class Conn {
  Connection connection;
  Statement statement;

  Conn(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///universitymanagement","root","172020");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
  }
}