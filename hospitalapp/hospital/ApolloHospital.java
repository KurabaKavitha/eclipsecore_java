package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	
	public static Patient[] patients;
	int index;
	
	public ApolloHospital(int size) {
		patients=new Patient[size];
	}
	
	public boolean addPatient(Patient patient) {
		System.out.println("inside the add patient method");
		boolean isPatientAdded=false;
		if(patient !=null) {
			System.out.println("patient details are correct");
			patients[index++]=patient;
			isPatientAdded=true;
		}
		return isPatientAdded;
		
		
	}
	public static  void getAllPatient() {
		for(int i=0;i<patients.length;i++) {
			System.out.println(patients[i].getPatient+" "+patients[i].getage+" "+patients[i].getgender+" "+patients[i].getaddress);
		}
		
		}
	public void getpatientByName(String patientName) {
		System.out.println("inside getpatientByName");
		System.out.println("No of arguments:1:patientName(string)");
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getpatientName().equals(patientName)) {
				System.out.println(patients[i].getPatient+" "+patients[i].getage+" "+patients[i].getgender+" "+patients[i].getaddress);
			}
			else {
				System.out.println("no patient found");
				
			}
		}
	}
	//
	}
	
	
	
	
	
	
	


