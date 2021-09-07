package com.school.factories;

import com.school.dao.Idao;
import com.school.dao.StudOracleDao;

public class StudOracleFactory extends AbstractFactory {

	/**
	 *This methods returns DAO of the oracle data store for the studentDB
	 */
	public Idao getDao() {
		
		return new StudOracleDao() ;
	}

}
