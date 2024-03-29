package com.joy.pre.api;

public class Prescription {
    
	private int id;
	private String name;
	private int age;
	private String gender;
	private String diagnosis;
	private String medicines;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
		return "Prescription [id=" + id +" name=" + name + ", age=" + age + ", gender=" + gender + ", diagnosis=" + diagnosis
				+ ", medicines=" + medicines + "]";
	}

}