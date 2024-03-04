package com.joy.pre.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joy.pre.DAO.PrescriptionDAO;
import com.joy.pre.DAO.PrescriptionDAOimple;
import com.joy.pre.api.LoginDTO;
import com.joy.pre.api.Prescription;
import com.joy.pre.api.PrescriptionDTO;
@Controller
public class PrescriptionController {

	@Autowired
	private PrescriptionDAO prescriptionDAO;

	@GetMapping("/showprescription")
	public String showPrescriptionList(Model model) {
		
		List<Prescription> prescriptionsList = prescriptionDAO.loadprescription();
		
		model.addAttribute("pres", prescriptionsList);
		return "prescription-list";
	}
	
	
	
	
	@GetMapping("/editprescription")
	public String editprescription(@ModelAttribute("prescription") PrescriptionDTO dto) {
		return "addprescription";
	}
	
	
	
	@GetMapping("/addprescription")
	public String addPrescription(@ModelAttribute("prescription") PrescriptionDTO dto) {
		
		
		return "addPrescription";
	}
	
	@GetMapping("/showlog")
	public String login(LoginDTO dto) {
		return "login";
	}
	
	@GetMapping("/logto")
	public String logcheck(LoginDTO dto) {
		if(prescriptionDAO.logcheck(dto)== true) {
			return "redirect:/showprescription";
		}
		else {
		
		return "login";
	}
	}
	
	
	@GetMapping("/save-prescription")
	public String savePres(PrescriptionDTO dto) {
       prescriptionDAO.savePres(dto);
		
        return "redirect:/showprescription";
    }
}
