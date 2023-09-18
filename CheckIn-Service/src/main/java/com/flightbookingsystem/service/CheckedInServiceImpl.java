package com.flightbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.entity.CheckIn;
import com.flightbookingsystem.exception.FlightNotFoundException;
import com.flightbookingsystem.repository.CheckedInRepository;

@Service
public class CheckedInServiceImpl implements CheckedInService {

	@Autowired
	CheckedInRepository checkInRepo;

	@Override
	public List<CheckIn> getAllCheckedPassengers() {
		// TODO Auto-generated method stub
		return checkInRepo.findAll();
	}

	@Override
	public String flightCheckIn(CheckIn checkIn) {
		// TODO Auto-generated method stub
		checkInRepo.save(checkIn);
		return "You are checkedIn and your checkInId is " + checkIn.getCheckedInId();
	}

	@Override
	public CheckIn getCheckIn(long id) {
		// TODO Auto-generated method stub
		CheckIn checkIn = checkInRepo.findById(id).orElseThrow(() -> new FlightNotFoundException("Flight Not Found"));

		return checkIn;
	}

}
