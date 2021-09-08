package com.aircraft.business;

import java.sql.SQLException;

import com.aircraft.dao.Idao;
import com.aircraft.dto.AircraftDto;
import com.aircraft.dto.SectorDto;
import com.aircraft.factories.AbstractFactory;
import com.aircraft.util.Scan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AircraftBo {
	public void aircraftSystem() {
		AbstractFactory factory = AbstractFactory.getFactory(1);
		Idao dao = factory.getDao();
		int choice ;
		do {
			System.out.println("1. Register an Aircraft");
			System.out.println("2. Register Sector for aircraft");
			System.out.println("3. View Sector Details for a particular Aircraft");
			System.out.println("4. exit");
			
			choice= Scan.getScannerInstance().nextInt();
			switch(choice) {
			case 1:
				RegisterAircraft(dao);
				break;
			case 2:
				RegisterSector(dao);
				break;
			case 3:
				viewSectorsByAircrafts(dao);
				break;
			case 4:
				System.out.println("Thank you for using!");
				return;
				
			}
			
		}while(choice<=4);
	}
	
	public void RegisterAircraft(Idao dao) {
		AircraftDto Adto = getAircraftDetails();
		try {
			dao.registerAircraft(Adto);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void RegisterSector(Idao dao) {
		SectorDto sdto = getSectorDetails();
		try {
			dao.registerSector(sdto);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void viewSectorsByAircrafts(Idao dao){
		HashMap<String,ArrayList<SectorDto>> sectorMap = new HashMap<>();
		ArrayList<SectorDto> slist = new ArrayList<>();
		try {
			sectorMap = dao.viewSectorsByAircraft();
			System.out.println("Enter the aircraft code for displaying sectors details:");
			String airCode = Scan.getScannerInstance().next();
			slist=sectorMap.get(airCode);
			if(slist!=null) {
				for(SectorDto s : slist) {
					System.out.println("Sector code   : "+ s.getSectorCode());
					System.out.println("Aircraft code   : "+ s.getAircraftCode());
					System.out.println("From station   : "+ s.getFromStation());
					System.out.println("To station     : "+ s.getToStation());
					System.out.println("Date           :" + s.getScheduleDate());
					System.out.println("Time           :" + s.getSeheduleTime());
					System.out.println("***********************************************************************");
				}
			}
			else {
				System.out.println("Sorry!..The Aircraft which you looking for is Not available at this time..\n");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private AircraftDto getAircraftDetails() {
		AircraftDto dto = new AircraftDto();
		Scanner sc = Scan.getScannerInstance();
		System.out.println("Enter the aircraft code:");
		dto.setAircraftCode(sc.next());
		System.out.println("Enter the Description of aircraft:");
		dto.setDescription(sc.next());
		return dto;
	}
	private SectorDto getSectorDetails() {
		SectorDto dto = new SectorDto();
		Scanner sc = Scan.getScannerInstance();
		System.out.println("Enter the sector code:");
		dto.setSectorCode(sc.next());
		System.out.println("Enter the aircraft code:");
		dto.setAircraftCode(sc.next());
		System.out.println("Enter the from station:");
		dto.setFromStation(sc.next());
		System.out.println("Enter the to station:");
		dto.setToStation(sc.next());
		System.out.println("Enter the Schedule date:");
		dto.setScheduleDate(sc.next());;
		System.out.println("Enter the Schedulen time:");
		dto.setSeheduleTime(sc.nextInt());
		return dto;
	}

}
