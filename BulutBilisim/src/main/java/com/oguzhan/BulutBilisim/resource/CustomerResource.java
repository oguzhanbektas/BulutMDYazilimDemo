package com.oguzhan.BulutBilisim.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oguzhan.BulutBilisim.model.Customer;
import com.oguzhan.BulutBilisim.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class CustomerResource {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String save(Customer customer) {
		customerService.save(customer);
		return "DENEME";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String bas() {
		return "Hello World";
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getCustomers();
	}

}
