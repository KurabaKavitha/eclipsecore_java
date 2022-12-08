package com.xworkz.hospitalapp.patient;
import com.xworkz.hospitalapp.constant.*;

@Getter
@Setter
public class Patient {

	private static String patientName;
	private static String address;
	private Gender gender;
	private Gender setgender;
	private static int age;
	private static String Patient;
	public static String getPatient;
	private static String getage;
	private static String getgender;
	private static String getaddress;
	
	public Patient(String string, String string2, Gender female, int i) {
		this.patientName=patientName;
		this.address=address;
		this. gender= gender;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("patient Name is:"+patientName);
		System.out.println("patient address is:"+address);
		System.out.println("patient gender is:"+gender);
		System.out.println("patient age is:"+age);
		
		
	}
	public static void setpatientName(String next) {
		// TODO Auto-generated method stub
		
	}
	public static void setaddress(String next) {
		// TODO Auto-generated method stub
		
	}
	public boolean getpatientName() {
		// TODO Auto-generated method stub
		return false;
	}
}
