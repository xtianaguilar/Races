package com.races.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.races.model.Race;

@RestController
@RequestMapping(value="/v1/races")
public class RacesController {

	@RequestMapping (value="/allRaces", method=RequestMethod.GET)
	public Race getAllRaces() {
		return new Race();
	}
	
}
