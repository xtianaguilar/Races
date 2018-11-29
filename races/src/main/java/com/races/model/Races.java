package com.races.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "races")
public class Races {
	
	@Id
	@Column(name = "idRace", nullable = false)
	private int idRace;
	
	@Column(name = "raceType")
	private String raceType;
	
	@Column(name = "raceLocation")
	private String raceLocation;
	
	@Column(name = "raceDate")
	private Date raceDate;
	
	@Column(name = "raceCategory")
	private String raceCategory;
	
	@Column(name = "name")
	private String name;

	public int getIdRace() {
		return idRace;
	}

	public void setIdRace(int idRace) {
		this.idRace = idRace;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	public String getRaceLocation() {
		return raceLocation;
	}

	public void setRaceLocation(String raceLocation) {
		this.raceLocation = raceLocation;
	}

	public Date getRaceDate() {
		return raceDate;
	}

	public void setRaceDate(Date raceDate) {
		this.raceDate = raceDate;
	}

	public String getRaceCategory() {
		return raceCategory;
	}

	public void setRaceCategory(String raceCategory) {
		this.raceCategory = raceCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
