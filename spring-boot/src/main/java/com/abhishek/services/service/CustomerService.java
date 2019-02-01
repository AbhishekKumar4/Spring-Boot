package com.abhishek.services.service;

import java.util.List;

import com.abhishek.services.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCusomers();

	public void saveCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Long id);
}
