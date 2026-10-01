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
public class Patient {

	private String firstName, middleName, lastName, 
	streetAddress, city, state, zipCode, phoneNum, emerName, emerPhoneNum;
	
	public Patient() {
		firstName="";
		middleName= "";
		lastName= "";
		streetAddress= "";
		city= "";
		state= "";
		zipCode= "";
		phoneNum= "";
		emerName= "";
		emerPhoneNum= "";
	}
	
	public Patient(String first, String middle, String last) {
		firstName=first;
		middleName=middle;
		lastName=last;
		streetAddress= "";
		city= "";
		state= "";
		zipCode= "";
		phoneNum= "";
		emerName= "";
		emerPhoneNum= "";
	}
	
	public Patient(String first, String middle, String last, String address, 
			String cit, String st, String zip, String phone, String emName, String emPhone) {
		firstName=first;
		middleName=middle;
		lastName=last;
		streetAddress=address;
		city=cit;
		state=st;
		zipCode=zip;
		phoneNum=phone;
		emerName=emName;
		emerPhoneNum=emPhone;
	}
	
	public void setFirstName(String first) {
		firstName=first;
	}
	public void setMiddleName(String middle) {
		middleName=middle;
	}
	public void setLastName(String last) {
		lastName=last;
	}
	public void setAddress(String address) {
		streetAddress=address;
	}
	public void setCity(String cit) {
		city=cit;
	}
	public void setState(String st) {
		state=st;
	}
	public void setZip(String zip) {
		zipCode=zip;
	}
	public void setPhone(String phone) {
		phoneNum=phone;
	}
	public void setEmName(String emName) {
		emerName=emName;
	}
	public void setEmPhone(String emPhone) {
		emerPhoneNum=emPhone;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return streetAddress;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zipCode;
	}
	public String getPhone() {
		return phoneNum;
	}
	public String getEmName() {
		return emerName;
	}
	public String getEmPhone() {
		return emerPhoneNum;
	}
	
	
	public String buildFullName() {
		String fullName= firstName+" "+middleName+" "+lastName;
		return fullName;
	}
	public String buildAddress() {
		String fullAddress= streetAddress+" "+city+" "+state+" "+ zipCode;
		return fullAddress;
	}
	public String buildEmergencyContact() {
		String emergencyContact= emerName+" "+emerPhoneNum;
		return emergencyContact;
	}
	public String toString() {
		String str="Patient Information:\n"+ "Name: "+ buildFullName() 
		+ "\nAddress: "+ buildAddress()+ "\nPhone Number: "+ phoneNum+ "\nEmergency Contact: "+buildEmergencyContact();
		return str;
	}
}
