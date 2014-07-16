package org.jugvale.peoplemanagement.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jugvale.peoplemanagement.model.Person;
import org.jugvale.peoplemanagement.service.PersonService;

@Path("person")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
	
	@Inject
	PersonService service;
	
	@GET
	@Path("rfid/{rfid}")
	public Person getPersonByRfid(@PathParam("rfid") String rfid){
		return service.findByRFID(rfid);
	}
}