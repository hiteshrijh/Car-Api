package org.hitesh.NewApp.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.hitesh.NewApp.model.Cars;
import org.hitesh.NewApp.service.Car;


@Path("/car")
public class CarsSource {
	Car car = new Car();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cars> get(){
		
		
		return car.getAllMessages();
	}
	}
