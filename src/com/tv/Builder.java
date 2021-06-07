package com.tv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Builder {

	public static void main(String[] args) {

		// Initializing local variables
		List<AdmitPatient> PatientList = new ArrayList<>();
		String curLoc = "Bengaluru";

		LocalDate currentDate = LocalDate.now();
		LocalDate currentDateMinus3Days = currentDate.minusDays(3);
		
		Hospital h = new Hospital();
		h.PatientData(PatientList);
		FindPercent fp = new FindPercent();
		fp.FindPercentage(PatientList, currentDateMinus3Days, curLoc);

	}

}
