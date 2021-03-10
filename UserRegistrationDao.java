package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import com.fujitsu.loginAndRegister.model.User;

public class UserRegistrationDao {
	
	public boolean registerUser(User user)
	{
		System.out.println("Strat of UserRegistrationDAO :: registerUser");
		String url="jdbc:mysql://localhost:3306/test1";
		String db_username="root";
		String db_password="root";
		
		Connection con;
		PreparedStatement pstmt;
		
		String sql="insert into user values(?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,db_username,db_password);
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getPassword());
			pstmt.setInt(4, user.getId());
			pstmt.setString(5, user.getAddress());
			
			int result=pstmt.executeUpdate();
			if(result>0)
				return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println("start of UserRegistrationDAO ::registerUser ");
		return false;
		
		
		
		
	}

}
