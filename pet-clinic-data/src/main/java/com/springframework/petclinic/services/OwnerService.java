/**
 * 
 */
package com.springframework.petclinic.services;

import java.util.Set;

import com.springframework.petclinic.model.Owner;

/**
 * @author HazariSH
 *
 */
public interface OwnerService implements CrudService<Owner, Long>{
	
	/* Find all entity by LastName property */
	Owner findByLastName(String lastName);
	
}
