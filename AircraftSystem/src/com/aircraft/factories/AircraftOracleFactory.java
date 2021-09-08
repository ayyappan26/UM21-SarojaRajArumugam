package com.aircraft.factories;

import com.aircraft.dao.AircraftOracleDao;
import com.aircraft.dao.Idao;

public class AircraftOracleFactory extends AbstractFactory {

	public Idao getDao() {
	
		return new AircraftOracleDao();
	}

}
