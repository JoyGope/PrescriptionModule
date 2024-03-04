package com.joy.pre.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.joy.pre.api.Login;

public class LoginRowmapper implements RowMapper<Login>{

	@Override
	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Login login=new Login();
		login.setUname(rs.getString("uname"));
		login.setPass(rs.getString("pass") );
		
		
		return login;
	}
	

}
