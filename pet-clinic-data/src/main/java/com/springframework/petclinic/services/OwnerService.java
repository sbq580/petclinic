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
public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
