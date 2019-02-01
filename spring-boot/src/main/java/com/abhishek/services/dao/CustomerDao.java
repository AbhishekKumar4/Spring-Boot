package com.abhishek.services.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.services.model.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long>{
	
}
