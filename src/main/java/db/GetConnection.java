package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class GetConnection {
    public static Connection getConnection() {
        Connection connection = null;
        Properties prop =new Properties();
        FileInputStream file = null;
        try {
			file = new FileInputStream("C:\\Users\\karan mailaram\\Downloads\\MVC8\\MVC8\\src\\main\\db.driver");
			System.out.println("File loaded successfully");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			prop.load(file);
			System.out.println("Properties loaded successfully");
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}
        
        
        
        
        try {
        	Class.forName(prop.getProperty("db.driver"));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(
            	prop.getProperty("db.url"),
            	prop.getProperty("db.user"),
            	prop.getProperty("db.password")
            	
            		);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

