package com.joy.pre.DAO;
import java.util.List;

import com.joy.pre.api.LoginDTO;
import com.joy.pre.api.Prescription;
import com.joy.pre.api.PrescriptionDTO;
public interface PrescriptionDAO {
 
	List<Prescription> loadprescription() ;
	
	void savePres(PrescriptionDTO dto);
	Boolean logcheck(LoginDTO dto);

}
