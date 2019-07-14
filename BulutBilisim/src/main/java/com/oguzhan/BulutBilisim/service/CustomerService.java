package com.oguzhan.BulutBilisim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oguzhan.BulutBilisim.model.Customer;
import com.oguzhan.BulutBilisim.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;

	public void save(Customer customer) {
		repo.save(customer);
	}

	public List<Customer> getCustomers() {
		return repo.findAll();
	}
}
