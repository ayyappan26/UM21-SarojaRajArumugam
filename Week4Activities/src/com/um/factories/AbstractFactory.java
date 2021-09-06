package com.um.factories;
import com.um.dao.*;

public abstract class AbstractFactory {

	public abstract Idao getDao();
	public static AbstractFactory getFactory(int choice) {
		AbstractFactory factory = null;
		switch(choice) {
		case 1:
			factory = new OracleFactory();
			break;
		case 2:
			factory = new MysqlFactory();
			break;
		case 3:
			factory = new FileSystemFactory();
			break;
		}
		return factory;
	}
}
