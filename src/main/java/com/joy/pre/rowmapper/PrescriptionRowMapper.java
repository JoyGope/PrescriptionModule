package com.joy.pre.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.joy.pre.api.Prescription;

public class PrescriptionRowMapper implements RowMapper<Prescription> {

	@Override
	public Prescription mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Prescription prescription= new Prescription();
		
		prescription.setName(rs.getString("name"));
		prescription.setAge(rs.getInt("age"));
		prescription.setGender(rs.getString("gender"));
		prescription.setDiagnosis(rs.getString("diagnosis"));
		prescription.setMedicines(rs.getString("medicines"));
		return prescription;
	}

}
