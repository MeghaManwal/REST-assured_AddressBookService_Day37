package com.addressbook;

import static org.testng.Assert.assertEquals;
import java.util.Arrays;
import static io.restassured.RestAssured.*;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import io.restassured.response.Response;

public class AddressBookService_test {
	
	@Before
	public void setup() {
		baseURI ="http://localhost";
		port = 3000;
	}
	
	public AddressBookData[] getAddressList() {
		Response response = get("/AddressBook");
		System.out.println("AddressBook Data in JsonServer: "+response.asString());
		AddressBookData[] dataArray = new Gson().fromJson(response.asString(),AddressBookData[].class);
		return dataArray;
	}
	
	@Test
	public void givenpayrollData_whenreterived_shouldMatchtheCount() {
		AddressBookData[] dataArray = getAddressList();
		AddressBookService addressbookservice = new AddressBookService(Arrays.asList(dataArray));
	        int entries = addressbookservice.countEntries();
		assertEquals(5, entries);
	}

}
