package com.um.factories;

import com.um.dao.FileSystemDao;
import com.um.dao.Idao;

public class FileSystemFactory extends AbstractFactory{

	public Idao getDao() {
		return new FileSystemDao();
	}

}
