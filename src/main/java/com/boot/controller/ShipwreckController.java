package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

	//Get LIST of Shipwrecks:
	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
	
	//Add Shipwreck:
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck) {
		return ShipwreckStub.create(wreck);
	}
	
	//Retrieve wreck by ID:
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}	
	
	//Update existing wreck:
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck wreck) {
		return ShipwreckStub.update(id, wreck);
	}
	
	//Delete a wreck!:
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}
	
	
	
}
