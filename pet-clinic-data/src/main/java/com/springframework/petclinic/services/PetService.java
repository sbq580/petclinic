/**
 * 
 */
package com.springframework.petclinic.services;

import java.util.Set;

import com.springframework.petclinic.model.Pet;

/**
 * @author HazariSH
 *
 */
public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
