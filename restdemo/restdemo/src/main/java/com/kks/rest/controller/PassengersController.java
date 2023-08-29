package com.kks.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kks.rest.entity.Passengers;
import com.kks.rest.exception.ResourceNotModifiedException;
import com.kks.rest.service.PassengersService;


@RestController
@RequestMapping("/passengers")
public class PassengersController 
{
	@Autowired
	PassengersService passengersService;
	
	@GetMapping
	public ResponseEntity<List<Passengers>> getAllPassengers()
	{
		List<Passengers> plist = passengersService.getAllPassengers();
		if(plist.size() != 0)
			return new ResponseEntity<List<Passengers>>(plist, HttpStatus.OK);
		return new ResponseEntity<List<Passengers>>(plist, HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/{passengerId}")
	public ResponseEntity<Passengers> getByPassengersId(@PathVariable int passengerId)
	{
		Passengers p = passengersService.getPassengersByPassengersId(passengerId);
		if(p!=null)
			return new ResponseEntity<Passengers>(p,HttpStatus.OK);
		return new ResponseEntity<Passengers>(p, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus insertPassenger(@RequestBody Passengers passengers)
	{
		passengersService.insertOrModify(passengers);
		return HttpStatus.OK;
		
	}
	
	@PutMapping(consumes="application/json")
	public HttpStatus modifyPassenger(@RequestBody Passengers passengers)
	{
		passengersService.insertOrModify(passengers);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{passengerId}")
	public HttpStatus deletePassenger(@PathVariable int passengerId)
	{
		if(passengersService.deletePassengersByPassengerId(passengerId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notModifiedException()
	{
		return HttpStatus.NOT_MODIFIED;
	}
}
