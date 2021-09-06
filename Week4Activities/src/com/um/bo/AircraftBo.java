package com.um.bo;



import com.um.dao.Idao;
import com.um.factories.AbstractFactory;

public class AircraftBo {
	public void aircraftSystem() {
		AbstractFactory factory = AbstractFactory.getFactory(2);
		Idao dao = factory.getDao();
		dao.registerAircraft();
		dao.viewAircrafts();
	}

}
