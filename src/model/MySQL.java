package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/softwareproject", "root", "20030909");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) throws Exception{

            Statement statement = connection.createStatement();
            
            if (query.startsWith("SELECT")) {
                return statement.executeQuery(query); //meken ywnwa kiyla denne baten

            } else {   
                statement.executeUpdate(query);//baten melo ekk ynne na kiylath kiynna oni
                return null;
            }

        }

}