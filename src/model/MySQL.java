package model;

import static gui.Login.log1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

    
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/****", "****", "");

        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    public static ResultSet execute(String query) throws Exception{

            Statement statement = connection.createStatement();
            
            if (query.startsWith("SELECT")) {
                return statement.executeQuery(query); 

            } else {   
                statement.executeUpdate(query);
                return null;
            }

        }

}
