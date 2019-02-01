package com.abhishek.services.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.services.model.Customer;
import com.abhishek.services.service.CustomerService;

@RestController
public class DemoController {
	
	@Autowired CustomerService customerService;

	@GetMapping(value = "/customers")
	public  ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> listOfCustomers = customerService.getAllCusomers();
		return new ResponseEntity<List<Customer>>(listOfCustomers, HttpStatus.OK);
	}

	@PostMapping(value = "/register")
	public @ResponseBody ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
	@PutMapping(value = "/modify")
	public @ResponseBody ResponseEntity<String> modifyCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public @ResponseBody ResponseEntity<String> removeCustomer(@PathVariable(value = "id") Long id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}