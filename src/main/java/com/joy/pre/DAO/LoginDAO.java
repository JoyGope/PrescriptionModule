package com.joy.pre.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class LoginDAO {
	String sql= "select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/prescription";
	String username = "root";
	String password = "joy@P1820#dutt";
	public boolean check(String uname, String pass) {
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			//System.out.println(rs);
			if(rs.next()) {
				return true; 
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

}