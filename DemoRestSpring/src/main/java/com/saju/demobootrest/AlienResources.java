package com.saju.demobootrest;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResources {

	@Autowired
	AlienRepository alienRepo;
	
	@RequestMapping("aliens")
	public List<Alien>getAliens(){
		
		List<Alien> aliens = (List<Alien>) alienRepo.findAll();
		return aliens;
		
	}
}
