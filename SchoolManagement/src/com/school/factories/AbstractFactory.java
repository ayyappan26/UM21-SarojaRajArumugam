package com.school.factories;

import com.school.dao.Idao;

/**
 * This class returns one of it's type of data store factories
 *
 */
public abstract class AbstractFactory {
	public abstract Idao getDao();
	public static AbstractFactory getFactory(int choice) {
		AbstractFactory factory = null;
		switch(choice) {
		case 1:
			factory = new StudOracleFactory();
			break;
		}
		return factory;
	}
	
}
