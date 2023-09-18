package com.flightbookingsystem.service;

import java.util.List;

import com.flightbookingsystem.entity.CheckIn;

public interface CheckedInService {

	List<CheckIn> getAllCheckedPassengers();

	String flightCheckIn(CheckIn checkIn);

	CheckIn getCheckIn(long id);

}
