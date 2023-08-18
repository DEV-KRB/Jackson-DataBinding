package com.eculant.jackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read json file and MAP/convert to java POJO
			//data/sample-lite.json
			
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);
			
			//print firstname and last name
			System.out.println("First Name = " + theStudent.getFirstName());
			System.out.println("Last Name = " + theStudent.getLastName());
			
			
			//print address
			Address theAddress = theStudent.getAddress();
			System.out.println("Street: " + theAddress.getStreet());
			System.out.println("City: " + theAddress.getCity());
			System.out.println("State: " + theAddress.getState());
			System.out.println("Country: " + theAddress.getCountry());
			System.out.println("Company: " + theAddress.getCompany());
			
			//print languages
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
