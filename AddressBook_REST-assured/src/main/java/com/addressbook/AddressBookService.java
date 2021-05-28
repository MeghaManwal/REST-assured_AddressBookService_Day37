package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {
	
	@Override
	public String toString() {
		return "AddressBookService [addressbook=" + addressbook + "]";
	}

	private List<AddressBookData> addressbook;
	
	public AddressBookService() {
		
	}
	
    public AddressBookService(List<AddressBookData> list) {
		this.addressbook = new ArrayList<>(list);
	}

	public int countEntries() {
		return  addressbook.size();
	}

}
