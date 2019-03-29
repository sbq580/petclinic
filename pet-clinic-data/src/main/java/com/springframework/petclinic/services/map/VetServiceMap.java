/**
 * 
 */
package com.springframework.petclinic.services.map;

import java.util.Set;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.CrudService;

/**
 * @author HazariSH
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return null;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
}
