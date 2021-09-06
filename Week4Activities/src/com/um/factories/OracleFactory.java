package com.um.factories;

import com.um.dao.Idao;
import com.um.dao.OracleDao;

public class OracleFactory extends AbstractFactory {

	public Idao getDao() {
		
		return new OracleDao();
	}
	
}
