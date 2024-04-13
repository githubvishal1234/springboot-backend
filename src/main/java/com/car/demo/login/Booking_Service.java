package com.car.demo.login;

import org.springframework.beans.factory.annotation.Autowired;

public class Booking_Service {
	@Autowired
	Booking_Repo bgRepo;

	public Booking_Entity addNewUser(Booking_Entity bgUser) {
		// TODO Auto-generated method stub
		return bgRepo.save(bgUser);
	}

	public String checkIsValidUser(String email, String password) {

		Booking_Entity lgUser = bgRepo.findByEmail(email);
		if ((bgUser != null) && (bgUser.getPassword().contentEquals(password) == true)) {

			return "success";
		}

		return "failure";
	}

	public Booking_Entity addNewUser(String email, String password) {
		Booking_Entity bgUser = new Booking_Entity(email,password);
		return bgRepo.save(bgUser);
	}
}
