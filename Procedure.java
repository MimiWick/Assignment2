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
public class Procedure {
	private String procedure, date, practitioner;
	private double charges;
	
	public Procedure() {
		procedure="";
		date="";
		practitioner="";
		charges=0.0;
	}
	
	public Procedure(String procedureName, String dateOfProcedure) {
		procedure=procedureName;
		date=dateOfProcedure;
		practitioner="";
		charges=0.0;
	}
	
	public Procedure(String procedureName, String dateOfProcedure, 
			String practitionerName, double chargesOfProcedure) {
		procedure=procedureName;
		date=dateOfProcedure;
		practitioner=practitionerName;
		charges=chargesOfProcedure;
		
	}
	
	
	public void setProcedure(String procedureName) {
		procedure=procedureName;
	}
	public void setDate(String dateOfProcedure) {
		date=dateOfProcedure;
	}
	public void setPractitioner(String practitionerName) {
		practitioner=practitionerName;
	}
	public void setCharge(double chargesOfProcedure) {
		charges=chargesOfProcedure;
	}
	
	
	public String getProcedure() {
		return procedure;
	}
	public String getDate() {
		return date;
	}
	public String getPractitioner() {
		return practitioner;
	}
	public double getCharge() {
		return charges;
	}
	
	public String toString() {
		String str="Procedure: " + procedure + "\tDate: "
	+ date + "\tPractitioner: "+ practitioner + "\tCharges: "+ charges;
		return str;
	}
}
