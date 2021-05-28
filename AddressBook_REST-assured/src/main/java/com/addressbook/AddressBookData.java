package com.addressbook;

public class AddressBookData {
	
     private String FirstName;
	 private String LastName;
	 private String Address;
	 private String City;
	 private String ZipCode;
	 private String PhoneNumber;
	 private String EmailId;


        public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public String getZipCode() {
		return ZipCode;
	}
	
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public String getEmailId() {
		return EmailId;
	}
	
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	public AddressBookData(String firstName, String lastName, String address, String city, String zipCode,
	                       String phoneNumber, String emailId) {
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		City = city;
		ZipCode = zipCode;
		PhoneNumber = phoneNumber;
		EmailId = emailId;
	}
	
	@Override
	public String toString() {
		return "AddressBookData [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
				+ City + ", ZipCode=" + ZipCode + ", PhoneNumber=" + PhoneNumber + ", EmailId=" + EmailId + "]";
	}
	
}
