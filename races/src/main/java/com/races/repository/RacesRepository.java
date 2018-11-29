package com.races.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.races.model.Races;

@Repository
public interface RacesRepository extends CrudRepository<Races, String> {
	
	public List<Races> findByRaceType(String raceType);
	
	public List<Races> findByRaceLocation(String location);
	
	public List<Races> findByRaceDate(String raceDate);
	
	public List<Races> findByRaceCategory(String raceCategory);
	
	public Races findByName(String name);

}
