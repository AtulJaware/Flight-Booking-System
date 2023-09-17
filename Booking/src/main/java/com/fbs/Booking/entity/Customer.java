package com.fbs.Booking.entity;


import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("booking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private long id;

	private String firstName;

	private String lastName;

	private String gender;
}
