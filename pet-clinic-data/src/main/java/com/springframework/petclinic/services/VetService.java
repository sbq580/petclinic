/**
 * 
 */
package com.springframework.petclinic.services;

import java.util.Set;

import com.springframework.petclinic.model.Vet;

/**
 * @author HazariSH
 *
 */
public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
