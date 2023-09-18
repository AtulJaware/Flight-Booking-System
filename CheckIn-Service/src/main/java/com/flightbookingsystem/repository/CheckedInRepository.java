package com.flightbookingsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.entity.CheckIn;

@Repository
public interface CheckedInRepository extends MongoRepository<CheckIn, Long> {

}
