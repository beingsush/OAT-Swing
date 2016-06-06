package Model;

import java.sql.*;

import dbconnect.DBConnect;
import view.Home;

public class LoginModel {
	DBConnect db = new DBConnect();

	public boolean checkuser(String email, String password) {
		db.connect();
		Connection con=db.getCon();
		String login="select * from student where email='"+email+"' and password='"+password+"'";
		try {
			PreparedStatement ps=con.prepareStatement(login);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Login Successful");
				new Home();
				return true;
			}
			else
			{
				System.out.println("Not logged in");
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
