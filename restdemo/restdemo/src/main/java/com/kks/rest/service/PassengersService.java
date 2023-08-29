package com.kks.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.kks.rest.entity.Passengers;
import com.kks.rest.entity.Train;
import com.kks.rest.exception.ResourceNotFoundException;
import com.kks.rest.repository.PassengersRepository;

@Service
public class PassengersService
{
	@Autowired
	PassengersRepository passengersRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Transactional(readOnly=true)
	public List<Passengers> getAllPassengers()
	{
		return passengersRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Passengers getPassengersByPassengersId(int passengerId)
	{
		Optional<Passengers> op = passengersRepository.findById(passengerId);
		if(op.isPresent()) 
		{
			Passengers passengers = op.get(); 
			Train train = restTemplate.getForEntity("http://localhost:8089/train/"+passengers.getTrainId(), Train.class).getBody();
			passengers.setTrain(train);
			return passengers;
		}
		return null;
	}
	
	@Transactional
	public void insertOrModify(Passengers passengers)
	{
		if(passengersRepository.save(passengers) == null)
			throw new ResourceNotFoundException();
	}
	
	@Transactional
	public boolean deletePassengersByPassengerId(int passengerId)
	{
		long count = passengersRepository.count();
		passengersRepository.deleteById(passengerId);
		return count > passengersRepository.count();
	}
}
