package com.tv;
import java.time.LocalDate;
import java.util.*;

public class Builder {
	
	public static void main(String[] args) {
			List<AdmitPatient> PatientList = new ArrayList<>();
		    LocalDate currentDate = LocalDate.now();
		    LocalDate currentDateMinus3Days = currentDate.minusDays(3);
		    LocalDate currentDateMinus5Days = currentDate.minusDays(5);
		    //Data Declaration
		    AdmitPatient p1 = new AdmitPatient("qwerty1", "Bengaluru", currentDate);
			AdmitPatient p2 = new AdmitPatient("qwerty2", "Bengaluru", currentDate);
			AdmitPatient p3 = new AdmitPatient("qwerty3", "Bengaluru", currentDateMinus5Days);
			AdmitPatient p4 = new AdmitPatient("qwerty4", "Mysuru", currentDateMinus5Days);
			AdmitPatient p5 = new AdmitPatient("qwerty5", "Mysuru", currentDateMinus3Days);
			//Adding object Patient to ArrayList
			PatientList.add(p1);
			PatientList.add(p2);
			PatientList.add(p3);
			PatientList.add(p4);
			PatientList.add(p5);
		
		//Initializing local variables
		String curLoc = "Bengaluru";
		int localPatient = 0, outPatient=0;	
		
		//iterating through each patient and verifying the mentioned conditions
		for(AdmitPatient each : PatientList){
			if (!(each.getPvisit().isBefore(currentDateMinus3Days))){
				if (((AdmitPatient) each).getPlocation().equalsIgnoreCase(curLoc))
					localPatient++;
				else
					outPatient++;
			}
		 
		}
		System.out.println("Local Patient percentage is "+ (localPatient*100)/(localPatient+outPatient)+ "%");
		System.out.println("Out Patient percentage is "+ (outPatient*100)/(localPatient+outPatient)+ "%");
	}
		
}

