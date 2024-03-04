package com.joy.pre.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

//import org.apache.tomcat.dbcp.dbcp2.Jdbc41Bridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.joy.pre.api.LoginDTO;
import com.joy.pre.api.Prescription;
import com.joy.pre.api.PrescriptionDTO;
import com.joy.pre.rowmapper.PrescriptionRowMapper;

@Repository
public class PrescriptionDAOimple implements PrescriptionDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
    
	@Override
	public List<Prescription> loadprescription() {
		// TODO Auto-generated method stub
		//List<Prescription> prescriptionList = new ArrayList<Prescription>();
		
		String sql="SELECT * FROM prescriptions" ;
		List<Prescription> theListofPres  = jdbcTemplate.query(sql, new PrescriptionRowMapper());
		return theListofPres;
	}
    
	
	@Override
	public Boolean logcheck(LoginDTO dto) {
		
		String sqlfn= "SELECT uname FROM login";
		String sqlfp= "SELECT pass FROM login";
		String sqln=jdbcTemplate.queryForMap(sqlfn).toString();
		Map<String, Object> sqlp=jdbcTemplate.queryForMap(sqlfp);
		System.out.println(sqln);
		System.out.println(sqlp);
		if(( sqln.contains(dto.getUname())&& sqlp.containsValue(dto.getPass()))) {
		
         return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public void savePres(PrescriptionDTO dto) {
		// TODO Auto-generated method stub
		Object[] sqlParameter= {dto.getName(),dto.getAge(),dto.getDiagnosis(),dto.getMedicines(),dto.getGender()};
		String sql= "insert into prescriptions(name,age,diagnosis,medicines,gender) values(?,?,?,?,?)";
		jdbcTemplate.update(sql, sqlParameter);
		System.out.println("one up");
	}

}
