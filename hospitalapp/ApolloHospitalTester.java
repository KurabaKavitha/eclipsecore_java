package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.ApolloHospital;
import com.xworkz.hospitalapp.hospital.patient;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalTester {
	
	public static void main(String args[]) {
		  
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size= scanner.nextInt();
		
		ApolloHospital apolloHospital =new ApolloHospital(size);
		for(int i=0;i<size;i++) {
		
		Patient patient=new Patient(null, null, null, i);
		System.out.println("enter the patient name");
		//Patient.PatientName="bhagya";
		Patient.setpatientName(scanner.next());
		//Patient.age=78;
				System.out.println("enter the patient age");
		Patient.age=scanner.nextInt();

		//Patient.address="marthalli";
		System.out.println("enter the patient address");
		Patient.address=scanner.next();
		System.out.println("enter the  patient gender");
		//patient.gender=Gender.female;
		String gender=scanner.next();
		patient.gender=Gender.valueOf(gender);
		Object apolloHospitals = null;
		 ((ApolloHospital) apolloHospitals).addPatient(patient);
	}
		ApolloHospital.getAllPatient();
		
	
	}

}
