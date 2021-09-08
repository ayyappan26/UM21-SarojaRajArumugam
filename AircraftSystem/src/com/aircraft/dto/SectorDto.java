package com.aircraft.dto;

import java.util.Date;

public class SectorDto {
	private String sectorCode;
	private String aircraftCode;
	private String fromStation;
	private String toStation;
	private String scheduleDate;
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getSectorCode() {
		return sectorCode;
	}
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	
	public int getSeheduleTime() {
		return seheduleTime;
	}
	public void setSeheduleTime(int seheduleTime) {
		this.seheduleTime = seheduleTime;
	}
	private int seheduleTime;


}
