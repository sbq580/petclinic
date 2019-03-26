/**
 * 
 */
package com.springframework.petclinic.model;

import java.time.LocalDate;

/**
 * @author HazariSH
 *
 */
public class Pet {
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	//Getters and setters
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
