package com.tv;

import java.time.LocalDate;

class AdmitPatient {

	// Variable declaration
	String Pname;
	String Plocation;
	LocalDate Pvisit;

	// Constructor
	public AdmitPatient(String pname, String plocation, LocalDate currentDate) {
		Pname = pname;
		Plocation = plocation;
		Pvisit = currentDate;
	}

	// Getters and setters
	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPlocation() {
		return Plocation;
	}

	public void setPlocation(String plocation) {
		Plocation = plocation;
	}

	public LocalDate getPvisit() {
		return Pvisit;
	}

	public void setPvisit(LocalDate pvisit) {
		Pvisit = pvisit;
	}

}
