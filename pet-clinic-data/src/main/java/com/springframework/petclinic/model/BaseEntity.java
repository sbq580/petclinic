/**
 * 
 */
package com.springframework.petclinic.model;

import java.io.Serializable;

/**
 * @author HazariSH
 *
 */
public class BaseEntity implements Serializable{
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
