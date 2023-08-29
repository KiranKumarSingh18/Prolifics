package com.kks.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.rest.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Integer>
{
	
}
