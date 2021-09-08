package com.aircraft.dao;

import java.sql.SQLException;

import com.aircraft.dto.AircraftDto;
import com.aircraft.dto.SectorDto;

import java.util.ArrayList;
import java.util.HashMap;

public interface Idao {
	public abstract void registerAircraft(AircraftDto adto) throws SQLException;
	public abstract void registerSector(SectorDto dto) throws SQLException;
	public abstract HashMap<String, ArrayList<SectorDto>> viewSectorsByAircraft() throws SQLException;
}
