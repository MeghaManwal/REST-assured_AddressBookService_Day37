package com.addressbook;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class AddressBooktestNG {
	
	@DataProvider(name = "dataforpost")
	public Object[][] dataforPost() {
		return new Object[][] {
			{"Rizvaan", "Khan", "Graham Cross","New Caledonia","6701234567","rizvaan@gmail.com"},
			{"Nia", "James","Seal Road","Las Vegas","4501345682","Njames@orkut.com"},
			{"Robert", "Hook","Patt Hills","Indiana","8145289903","robert345@outlook.com"}
		};	
	}
	
	@Test(dataProvider = "dataforpost")
	public void givenMultipleRecords_shouldReturn_201statusCode(String firstName, String lastName, String Address, String City,
			                                                     String PhoneNumber, String EmailId) {
		JSONObject request = new JSONObject();
		
		request.put("firstName", firstName);
		request.put("lastName",  lastName);
		request.put("Address", Address);
		request.put("City", City);
		request.put("PhoneNumber", PhoneNumber);
		request.put("EmailId", EmailId);
		
		baseURI ="http://localhost";
		port = 3000;
		
		given().
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).
		       header("Content-Type", "application/json").
		       body(request.toJSONString()).
		when().
		      post("/AddressBook").
		then().
		      statusCode(201).
		      log().all();
	}
	
	@Test
	public void updateExistingRecord_shouldReturn_200statusCode() {
		JSONObject request = new JSONObject();
		request.put("City",  "Venice");

		baseURI ="http://localhost";
		port = 3000;

		given().
		       contentType(ContentType.JSON).
		       accept(ContentType.JSON).
		       header("Content-Type", "application/json").
		       body(request.toJSONString()).
		when().
		      patch("/AddressBook/4").
		then().
		      statusCode(200).
		      log().all();	
	}

}
