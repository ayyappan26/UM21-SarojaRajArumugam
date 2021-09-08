package com.aircraft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.aircraft.dto.AircraftDto;
import com.aircraft.dto.SectorDto;
import com.data.DBConnect;

public class AircraftOracleDao implements Idao {
	public void registerAircraft(AircraftDto dto) throws SQLException {
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "INSERT INTO aircrafts VALUES(?,?)";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1, dto.getAircraftCode());
		pst.setString(2, dto.getDescription());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Inserted : "+ rowsUpdated);
		
	}

	
	public void registerSector(SectorDto dto) throws SQLException {
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "INSERT INTO sector VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1, dto.getSectorCode());
		pst.setString(2, dto.getAircraftCode());
		pst.setString(3, dto.getFromStation());
		pst.setString(4, dto.getToStation());
		pst.setString(5, dto.getScheduleDate());
		pst.setInt(6, dto.getSeheduleTime());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Inserted : "+ rowsUpdated);
		
	}


	private boolean isPresentaircraft(String aircode) throws SQLException {
		boolean flag=false;
		Connection con = DBConnect.getDbConnection();
		Statement st = con.createStatement();
		String sqlQuery = "select aircraft_code from sector";
		ArrayList<String> airList = new ArrayList<>();
		ResultSet rs = st.executeQuery(sqlQuery);
		while(rs.next()) {
			airList.add(rs.getString(1));
		}
		if(airList.contains(aircode)) {
			flag=true;
		}
		return flag;
	}
	public HashMap<String, ArrayList<SectorDto>> viewSectorsByAircraft() throws SQLException {
		HashMap<String, ArrayList<SectorDto>> h1 = new HashMap<>();
		SectorDto sdto = null;
		ArrayList<String> aircraftList = new ArrayList<>();
		ArrayList<SectorDto> sectorList = new ArrayList<>();
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "SELECT aircraft_code FROM aircrafts";
		String sqlQuery2=null;
		boolean isAircode;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
	
		
		while(rs.next()) {
			aircraftList.add(rs.getString(1));
		}
		for(String code: aircraftList) {
			isAircode = isPresentaircraft(code);
			if(isAircode) {
				
				sqlQuery2 = "SELECT * from sector where aircraft_code=?";
				PreparedStatement pst = con.prepareStatement(sqlQuery2);
				pst.setString(1, code);
				ResultSet sectorSet = pst.executeQuery();
				while(sectorSet.next()) {
					sdto = new SectorDto();
					sdto.setSectorCode(sectorSet.getString(1));
					sdto.setAircraftCode(sectorSet.getString(2));
					sdto.setFromStation(sectorSet.getString(3));
					sdto.setToStation(sectorSet.getString(4));
					sdto.setScheduleDate(sectorSet.getString(5));
					sdto.setSeheduleTime(sectorSet.getInt(6));
					sectorList.add(sdto);
				}
				h1.put(code, sectorList);
				sectorList=new ArrayList<>();
			}
			else {
				h1.put(code, null);
			}
		}
		
		return h1;
	}
}
