package independent.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	
	
	Connection connection;
	
	public MySQLConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ai", "root", "root");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
	
	
	public Connection getConnection(){
		return connection;
	}
}
