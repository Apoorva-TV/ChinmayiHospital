package com.tv;

import java.time.LocalDate;

public class Builder {

	public static void main(String[] args) {

		// Initializing local variable
		String curLoc = "Bengaluru";
		LocalDate currentDate = LocalDate.now();
		LocalDate currentDateMinus3Days = currentDate.minusDays(3);

		Hospital h = new Hospital();
		h.createPatients();
		h.FindPercentage(currentDateMinus3Days, curLoc);

	}

}
