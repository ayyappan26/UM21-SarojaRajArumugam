package com.aircraft.factories;

import com.aircraft.dao.Idao;

public abstract class AbstractFactory {
	public abstract Idao getDao();
	public static AbstractFactory getFactory(int choice) {
		AbstractFactory factory = null;
		switch(choice) {
		case 1:
			factory = new AircraftOracleFactory();
			break;
		case 2:
			factory = new AircraftFileFactory();
			break;
		}
		return factory;
	}
}
