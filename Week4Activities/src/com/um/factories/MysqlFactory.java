package com.um.factories;

import com.um.dao.Idao;
import com.um.dao.MysqlDao;

public class MysqlFactory extends AbstractFactory {

	public Idao getDao() {
		
		return new MysqlDao();
	}
	

}
