package singletonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static DatabaseConnection instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/demo";
	private String user = "dbadmin";
	private String password = "pass";
	
	private DatabaseConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established successfully...");
		} catch (ClassNotFoundException ex) {
			System.out.println("Database Connection Creation Failed : " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public static DatabaseConnection getInstance() throws SQLException {
		if (instance == null) {
			instance = new DatabaseConnection();
		} else if (instance.getConnection().isClosed()) {
			instance = new DatabaseConnection();
		}
		
		return instance;
	}
}
