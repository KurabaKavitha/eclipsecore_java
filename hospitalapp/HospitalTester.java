package com.xworkz.hospitalapp;
import java.util.Scanner;
import java.util.Scanner.*;
import com.xworkz.hospitalapp.hospital.*;
import com.xworkz.hospitalapp.patient.*;
import com.xworkz.hospitalapp.constant.Gender;

public class HospitalTester {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the patient name");
		String patientName =sc.next();
		System.out.println("Enter the patient address");
		String address =sc.next();
		System.out.println("Enter the patient age");
		int age = sc.nextInt();
		
		
		Patient patient=new Patient("kavi","bellari",Gender.female,22);
		Hospital p = new Hospital();
		p.admit(patient);
		sc.close();
			}
}
