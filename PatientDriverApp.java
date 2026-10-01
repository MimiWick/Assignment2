/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Patient Application Form
 * Due: 09/30/2026
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Mia Wicksteed
*/
import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		String firstName, middleName, lastName, streetAddress,
		city, state, zipCode, phone,emerName, emerPhone,
		practitionerName, dateOfProcedure, procedureName,
		practitionerName2, dateOfProcedure2, procedureName2,
		practitionerName3, dateOfProcedure3, procedureName3;
		double charge, charge2, charge3, total;
		
		Scanner scan=new Scanner(System.in);
		
		Patient patient=new Patient();
		
		System.out.println("Enter your first name: ");
		firstName=scan.nextLine();
		System.out.println("Enter your middle name: ");
		middleName=scan.nextLine();
		System.out.println("Enter your last name: ");
		lastName=scan.nextLine();
		System.out.println("Enter your street address: ");
		streetAddress=scan.nextLine();
		System.out.println("Enter your city: ");
		city=scan.nextLine();
		System.out.println("Enter your state: ");
		state=scan.nextLine();
		System.out.println("Enter your zip code: ");
		zipCode=scan.nextLine();
		System.out.println("Enter your phone number: ");
		phone=scan.nextLine();
		System.out.println("Enter the name of your emergency contact: ");
		emerName=scan.nextLine();
		System.out.println("Enter the phone number of your emergency contact: ");
		emerPhone=scan.nextLine();
		
		patient.setFirstName(firstName);
		patient.setMiddleName(middleName);
		patient.setLastName(lastName);
		patient.setAddress(streetAddress);
		patient.setCity(city);
		patient.setState(state);
		patient.setZip(zipCode);
		patient.setPhone(phone);
		patient.setEmName(emerName);
		patient.setEmPhone(emerPhone);
		
		
		Procedure procedure1=new Procedure();
		System.out.println("Procedure 1");
		System.out.println("Enter the name of the procedure: ");
		procedureName=scan.nextLine();
		System.out.println("Enter the date of the procedure: ");
		dateOfProcedure=scan.nextLine();
		System.out.println("Enter the name of the practitioner: ");
		practitionerName=scan.nextLine();
		System.out.println("Enter the charges for the procedure: ");
		charge=scan.nextDouble();
		scan.nextLine();
		
		procedure1.setProcedure(procedureName);
		procedure1.setDate(dateOfProcedure);
		procedure1.setPractitioner(practitionerName);
		procedure1.setCharge(charge);
		

		Procedure procedure2=new Procedure(procedureName,dateOfProcedure);
		System.out.println("Procedure 2");
		System.out.println("Enter the name of the procedure: ");
		procedureName2=scan.nextLine();
		System.out.println("Enter the date of the procedure: ");
		dateOfProcedure2=scan.nextLine();
		System.out.println("Enter the name of the practitioner: ");
		practitionerName2=scan.nextLine();
		System.out.println("Enter the charges for the procedure: ");
		charge2=scan.nextDouble();
		scan.nextLine();
		
		procedure2.setProcedure(procedureName2);
		procedure2.setDate(dateOfProcedure2);
		procedure2.setPractitioner(practitionerName2);
		procedure2.setCharge(charge2);
		
		
		Procedure procedure3=new Procedure(procedureName, dateOfProcedure, practitionerName, charge);
		System.out.println("Procedure 3");
		System.out.println("Enter the name of the procedure: ");
		procedureName3=scan.nextLine();
		System.out.println("Enter the date of the procedure: ");
		dateOfProcedure3=scan.nextLine();
		System.out.println("Enter the name of the practitioner: ");
		practitionerName3=scan.nextLine();
		System.out.println("Enter the charges for the procedure: ");
		charge3=scan.nextDouble();
		scan.nextLine();
		
		procedure3.setProcedure(procedureName3);
		procedure3.setDate(dateOfProcedure3);
		procedure3.setPractitioner(practitionerName3);
		procedure3.setCharge(charge3);
		
		
		displayPatient(patient);
		
		System.out.println("Procedure 1:");
		displayProcedure(procedure1);
		
		System.out.println("Procedure 2:");
		displayProcedure(procedure2);
		
		System.out.println("Procedure 3:");
		displayProcedure(procedure3);
		
		total= calculateTotalCharges(procedure1,procedure2,procedure3);
		System.out.printf("Total of all procedures is: $%,.2f%n", total );
	
		System.out.println("\nProgram was developed by a Student: Mia Wicksteed 09/30/26");
		scan.close();
	}
	
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		double total;
		total=procedure1.getCharge()+procedure2.getCharge()+procedure3.getCharge();
		return total;
	}
}
