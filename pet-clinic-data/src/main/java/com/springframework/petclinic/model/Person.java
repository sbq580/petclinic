/**
 * 
 */
package com.springframework.petclinic.model;

/**
 * @author HazariSH
 *
 */
public class Person extends BaseEntity{
	private String firstName;
	private String lastName;
	
	//Getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
