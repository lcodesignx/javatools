package singletonDesignPattern;

import java.sql.SQLException;

public class TestSingletonPattern {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseConnection instance = DatabaseConnection.getInstance();
		System.out.println(instance);
	}

}
