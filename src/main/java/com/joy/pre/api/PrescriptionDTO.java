package com.joy.pre.api;

import java.time.LocalDate;
import java.util.Date;

public class PrescriptionDTO {
   
	//private static final Date LocalDate = null;
	private String name;
	private int age;
	private String diagnosis;
	private String medicines;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	
	@Override
	public String toString() {
		return "PrescriptionDTO [name=" + name + ", age=" + age + ", diagnosis=" + diagnosis + ", medicines="
				+ medicines + "]";
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
