package org.hitesh.NewApp.service;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.hitesh.NewApp.model.Cars;

public class Car {
private Map<Long, Cars> typeofcars = new HashMap<>();
	
	public Car() {
		typeofcars.put(1L, new Cars("BMW","Merc","Honda","Toyota"));
		typeofcars.put(2L, new Cars("Audi","Nissan","Subaru","Dodge"));
	}
		
	public List<Cars> getAllMessages() {
		return new ArrayList<Cars>(typeofcars.values()); 
		
	}
}
