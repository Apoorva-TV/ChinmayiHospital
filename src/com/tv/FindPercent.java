package com.tv;

import java.time.LocalDate;
import java.util.List;

public class FindPercent {
	public void FindPercentage(List<AdmitPatient> PatientList, LocalDate currentDateMinus3Days, String curLoc) {
		int localPatient = 0, outPatient = 0;
		// iterating through each patient and verifying the mentioned conditions
		for (AdmitPatient each : PatientList) {
			if (!(each.getPvisit().isBefore(currentDateMinus3Days))) {
				if (((AdmitPatient) each).getPlocation().equalsIgnoreCase(curLoc))
					localPatient++;
				else
					outPatient++;
			}
			

		}

		System.out.println("Local Patient percentage is " + (localPatient * 100) / (localPatient + outPatient) + "%");
		System.out.println("Out Patient percentage is " + (outPatient * 100) / (localPatient + outPatient) + "%");
	}
}
