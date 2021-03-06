package org.gokuma.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariaDBConnectionTest {
	
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String USER = "gokuma";
	private static final String PW = "gokuma123";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
			
			System.out.println("성공");
			
		}catch(Exception e) {
			System.out.println("catch");
			e.printStackTrace();
		}
	}
}
