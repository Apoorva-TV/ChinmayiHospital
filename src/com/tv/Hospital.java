package com.tv;

import java.time.LocalDate;
import java.util.List;

public class Hospital {
	public void PatientData(List<AdmitPatient> PatientList) {

		LocalDate currentDate = LocalDate.now();
		LocalDate currentDateMinus3Days = currentDate.minusDays(3);
		LocalDate currentDateMinus5Days = currentDate.minusDays(5);

		// Data Declaration
		AdmitPatient p1 = new AdmitPatient("qwerty1", "Bengaluru", currentDate);
		AdmitPatient p2 = new AdmitPatient("qwerty2", "Bengaluru", currentDate);
		AdmitPatient p3 = new AdmitPatient("qwerty3", "Bengaluru", currentDate);
		AdmitPatient p4 = new AdmitPatient("qwerty4", "Mysuru", currentDateMinus5Days);
		AdmitPatient p5 = new AdmitPatient("qwerty5", "Mysuru", currentDateMinus3Days);

		// Adding object Patient to ArrayList
		PatientList.add(p1);
		PatientList.add(p2);
		PatientList.add(p3);
		PatientList.add(p4);
		PatientList.add(p5);
	}

}
