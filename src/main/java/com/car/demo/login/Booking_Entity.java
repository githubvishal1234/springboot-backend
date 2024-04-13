package com.car.demo.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking_Entity {
	
@Id
private String originlocation;
private String destinationlocation;
private String passg_Numbers;
private String pickuptime;
public Booking_Entity(String originlocation, String destinationlocation, String passg_Numbers, String pickuptime) {
	super();
	this.originlocation = originlocation;
	this.destinationlocation = destinationlocation;
	this.passg_Numbers = passg_Numbers;
	this.pickuptime = pickuptime;
}
public Booking_Entity() {
	super();
}
public String getOriginlocation() {
	return originlocation;
}
public void setOriginlocation(String originlocation) {
	this.originlocation = originlocation;
}
public String getDestinationlocation() {
	return destinationlocation;
}
public void setDestinationlocation(String destinationlocation) {
	this.destinationlocation = destinationlocation;
}
public String getPassg_Numbers() {
	return passg_Numbers;
}
public void setPassg_Numbers(String passg_Numbers) {
	this.passg_Numbers = passg_Numbers;
}
public String getPickuptime() {
	return pickuptime;
}
public void setPickuptime(String pickuptime) {
	this.pickuptime = pickuptime;
}



}
