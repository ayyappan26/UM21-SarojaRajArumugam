package com.test.collectionExercise;

import java.util.HashSet;

public class Countries {
	HashSet<String> country = new HashSet<String>();
	public HashSet<String> storeCountryNames(String countryName){
		country.add(countryName);
		return country;
	}
	
	public String retreiveCountry(String countryName) {
		if(country.contains(countryName)) {
			return(countryName);
		}
		else {
			return(null);
		}
	}
	
	public static void main(String[] args) {
		Countries c = new Countries();
		c.storeCountryNames("India");
		c.storeCountryNames("America");
		c.storeCountryNames("Goa");
		
		String isCountry = c.retreiveCountry("Afghanisthan");
		if(isCountry!=null) {
			System.out.println(isCountry + " is presented in countryList");
		}
		else {
			System.out.println(isCountry + " is not presented in countryList");
		}
	}

}
