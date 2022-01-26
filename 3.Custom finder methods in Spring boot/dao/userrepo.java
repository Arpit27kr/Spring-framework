package com.jpa.test.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.user;

public interface userrepo extends CrudRepository<user,Integer>

{
	public List<user> findByName(String name);    // these methods are created to find record by given name or city 
	public List<user>findByNameAndCity(String name,String city);
	public List<user>findbyFirstcityStartingWith(String prefix);  // name staring with prefix(starting words
	
	
	

}
