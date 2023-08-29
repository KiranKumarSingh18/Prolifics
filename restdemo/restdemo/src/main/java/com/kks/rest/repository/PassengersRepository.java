package com.kks.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.rest.entity.Passengers;

public interface PassengersRepository extends JpaRepository<Passengers, Integer>{

}
