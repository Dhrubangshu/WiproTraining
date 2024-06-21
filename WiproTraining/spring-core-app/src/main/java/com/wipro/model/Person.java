package com.wipro.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
   private Long adharCard;
   private String name;
   
   @Autowired
   private Address temporaryAddress;
   @Autowired
   private Address permanentAdress;
   
   public Person() {
	   
   }
    public Long getAdharCard() {
	return adharCard;
}
public void setAdharCard(Long adharCard) {
	this.adharCard = adharCard;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getTemporaryAddress() {
	return temporaryAddress;
}
public void setTemporaryAddress(Address temporaryAddress) {
	this.temporaryAddress = temporaryAddress;
}
public Address getPermanentAdress() {
	return permanentAdress;
}
public void setPermanentAdress(Address permanentAdress) {
	this.permanentAdress = permanentAdress;
}
	public Person(Long adharCard, String name, Address temporaryAddress, Address permanentAdress) {
	super();
	this.adharCard = adharCard;
	this.name = name;
	this.temporaryAddress = temporaryAddress;
	this.permanentAdress = permanentAdress;
}
	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", temporaryAddress=" + temporaryAddress
				+ ", permanentAdress=" + permanentAdress + "]";
	}
   
   
}
