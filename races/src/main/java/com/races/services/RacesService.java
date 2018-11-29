package com.races.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.races.config.ServiceConfig;
import com.races.model.Races;
import com.races.repository.RacesRepository;

@Service
public class RacesService {

	@Autowired
	private RacesRepository racesRepository;
	
	@Autowired
	ServiceConfig serviceConfig;
	
	public Races getRaces(String id) {
		Optional<Races> races = racesRepository.findById(id);
		return races.isPresent() ? races.get() : null;
	}
	
	public void saveRaces(Races races) {
		racesRepository.save(races);
	}
	
}
