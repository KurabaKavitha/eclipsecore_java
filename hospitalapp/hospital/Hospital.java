package com.xworkz.hospitalapp.hospital;
import com.xworkz.hospitalapp.patient.*;
public class Hospital {

	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmenRequired;
	
	public boolean admit( Patient patient) {
		boolean isAdmit=true;
		if(isTreatmenRequired == true) {
			System.out.println("TreatmenRequired is allowed");
		if(isEmergency == true) {
			System.out.println("emergency is allowed");
			this.patient=patient;
			this.patient.displayInfo();
			System.out.println("patient can be allowed");
			isAdmit=true;
		}
		else {
			System.out.println("add the patient  details");
		}
}
		else {
			System.out.println("patient cannot be allowed");
		}
		return isAdmit;
		}
	}


