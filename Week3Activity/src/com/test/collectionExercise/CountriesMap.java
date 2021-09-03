package com.test.collectionExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountriesMap {
	HashMap<String, String> countryMap = new HashMap<String,String>();
	HashMap<String, String> hashMap2 = new HashMap<String,String>();
	Set<String> keys = countryMap.keySet();
	public HashMap<String, String> storeCountryCapital(String country, String capital){
		countryMap.put(country, capital);
		return countryMap;
	}
	public void retreiveCapital(String countryName) {
		if(countryMap.containsKey(countryName)) {
			System.out.println("Capital of "+countryName + "=" +countryMap.get(countryName));
		}
		else {
			System.out.println("No such country is available in this countryMap");
		}
	}
	
	public void retreiveCountry(String capitalName) {
		
        for (String key: keys)
        {
            if(capitalName.equals(countryMap.get(key))) {
                System.out.println(key + "is a capital of "+countryMap.get(key));
            }
        }
	}
	public HashMap<String,String> exchangeKeyValue(HashMap<String,String> h1){
		for(String key: keys) {
			hashMap2.put(countryMap.get(key),key);
		}
		
		
		return(hashMap2);
	}
	public List<String> mapToList(HashMap<String,String> h1){
		List<String> countryList = new ArrayList<String>();
		for(String k : h1.keySet()) {
			countryList.add(k);
		}
		return(countryList);
		
	}
	public static void main(String[] args) {
		CountriesMap cMap = new CountriesMap();
		HashMap<String,String> countryCapital = new HashMap<String, String>();
		HashMap<String,String> capitalCountry = new HashMap<String, String>();
		List<String> arrList = new ArrayList<String>();
		
		countryCapital=cMap.storeCountryCapital("India", "Delhi");
		countryCapital=cMap.storeCountryCapital("Japan", "Tokyo");
		cMap.retreiveCapital("India");
		cMap.retreiveCountry("Tokyo");
		
		capitalCountry = cMap.exchangeKeyValue(countryCapital);
		System.out.println("Courtry    : Capital");
		for(String k: countryCapital.keySet()) {
			System.out.println(k+":"+countryCapital.get(k));
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Capital    : Country");
		for(String k: capitalCountry.keySet()) {
			System.out.println(k+":"+capitalCountry.get(k));
		}
		
		arrList = cMap.mapToList(countryCapital);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Countries List");
		for(String c:arrList) {
			System.out.println(c);
		}
	}

}
