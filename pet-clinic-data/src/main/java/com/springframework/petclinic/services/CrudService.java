/**
 * 
 */
package com.springframework.petclinic.services;

import java.util.Set;

/**
 * @author HazariSH
 *
 */
public interface CrudService<T, ID> {
	
	/* Find all data */
	Set<T> findAll();
	
	/* Find data by id */
	T findById(ID id);
	
	/* Save data */
	T save(T object);
	
	/* Delete data */
	void delete(T object);
	
	/* Delete data by id */
	void deleteById(ID id);
	
}
