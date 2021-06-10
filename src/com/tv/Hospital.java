package com.tv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Patient> PatientList = new ArrayList<>();

	public void createPatients() {

		LocalDate currentDate = LocalDate.now();
		LocalDate currentDateMinus3Days = currentDate.minusDays(3);
		LocalDate currentDateMinus5Days = currentDate.minusDays(5);

		// Data Declaration
		Patient p1 = new Patient("qwerty1", "Bengaluru", currentDate);
		Patient p2 = new Patient("qwerty2", "Bengaluru", currentDate);
		Patient p3 = new Patient("qwerty3", "Mysuru", currentDate);
		Patient p4 = new Patient("qwerty4", "Bengaluru", currentDateMinus5Days);
		Patient p5 = new Patient("qwerty5", "Mysuru", currentDateMinus3Days);

		// Adding object Patient to ArrayList
		PatientList.add(p1);
		PatientList.add(p2);
		PatientList.add(p3);
		PatientList.add(p4);
		PatientList.add(p5);
	}

	public void FindPercentage(LocalDate currentDateMinus3Days, String curLoc) {
		int localPatient = 0, outPatient = 0;
		// iterating through each patient and verifying the mentioned conditions
		for (Patient each : PatientList) {
			if (!(each.getPvisit().isBefore(currentDateMinus3Days))) {
				if (((Patient) each).getPlocation().equalsIgnoreCase(curLoc))
					localPatient++;
				else
					outPatient++;
			}

		}
		//Printing the results
		System.out.println("Local Patient percentage is " + (localPatient * 100) / (localPatient + outPatient) + "%");
		System.out.println("Out Patient percentage is " + (outPatient * 100) / (localPatient + outPatient) + "%");
	}

}
