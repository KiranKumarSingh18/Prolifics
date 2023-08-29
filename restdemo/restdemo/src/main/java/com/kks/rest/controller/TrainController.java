package com.kks.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kks.rest.entity.Train;
import com.kks.rest.exception.ResourceNotModifiedException;
import com.kks.rest.service.TrainService;

/*@Controller
@ResponseBody*/

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/train")
public class TrainController {
	
	@Autowired
	TrainService trainService;
	
//	@GetMapping("/")
	@GetMapping(value="/", produces="application/json")
	public ResponseEntity<List<Train>> getAllTrains()
	{
		List<Train> tlist = trainService.getAllTrains();
		if(tlist.size() != 0)
			return new ResponseEntity<List<Train>>(tlist,HttpStatus.OK);
		return new ResponseEntity<List<Train>>(tlist,HttpStatus.NOT_FOUND);
	}
	
//	@GetMapping("/{trainId}")
	@GetMapping(value="/{trainId}", produces="application/json")
	public ResponseEntity<Train> getTrainByTrainId(@PathVariable int trainId)
	{
		Train t = trainService.getTrainByTrainId(trainId);
		if(t!=null)
			return new ResponseEntity<Train>(t, HttpStatus.OK);
		return new ResponseEntity<Train>(t,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertTrain(@RequestBody Train train)
	{
		trainService.insertOrModifyTrain(train);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyTrain(@RequestBody Train train)
	{
		trainService.insertOrModifyTrain(train);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{trainId}")
	public HttpStatus deleteTrain(@PathVariable int trainId)
	{
		if(trainService.deleteTrainByTrainId(trainId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notModifiedExceptionHandler()
	{
		return HttpStatus.NOT_MODIFIED;
	}

}
