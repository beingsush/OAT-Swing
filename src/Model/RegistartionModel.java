package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnect.DBConnect;

public class RegistartionModel {
	DBConnect db = new DBConnect();

	public boolean register(String fname, String lname, String email, String pass, int mobile) {
		db.connect();
		Connection con=db.getCon();
		
		String query="insert into student values(NULL,'"+fname+"','"+lname+"','"+email+"','"+pass+"',1,'"+mobile+"')";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			int rs=ps.executeUpdate();
			System.out.println(rs);
			if(rs!=0)
			{
				System.out.println("Register Successful");
				return true;
			}
			else
			{
				System.out.println("Not Registered");
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
