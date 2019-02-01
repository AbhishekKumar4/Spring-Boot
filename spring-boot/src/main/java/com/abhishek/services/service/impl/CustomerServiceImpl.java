package com.abhishek.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.services.dao.CustomerDao;
import com.abhishek.services.model.Customer;
import com.abhishek.services.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getAllCusomers() {
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerDao.delete(id);
	}

}
