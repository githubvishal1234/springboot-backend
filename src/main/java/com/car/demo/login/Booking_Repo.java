package com.car.demo.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Booking_Repo extends JpaRepository<Booking_Entity, String>{

	Booking_Entity findByEmail(String email);
}
