package com.car.demo.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Login_Repo extends JpaRepository<Login_Entity ,String> {
	Login_Entity findByEmail(String email);


}
