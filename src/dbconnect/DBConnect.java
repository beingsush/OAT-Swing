package dbconnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnect {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/oattest_swing";
	private String username="root";
	private String password="root";
	
	public Connection getCon() {
		return con;
	}
	


	public void setCon(Connection con) {
		this.con = con;
	}
	


	private Connection con=null;
	
	
	public void connect()
	{
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
