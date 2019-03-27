/**
 * 
 */
package com.springframework.petclinic.model;

/**
 * @author HazariSH
 *
 */
public class PetType extends BaseEntity{
	private String name;

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
