package com.aircraft.factories;

import com.aircraft.dao.AircraftFileDao;
import com.aircraft.dao.Idao;

public class AircraftFileFactory extends AbstractFactory {
	public Idao getDao() {
		return new AircraftFileDao();
	}
}
