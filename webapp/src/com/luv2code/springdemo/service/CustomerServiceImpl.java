package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer();
	}
	
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDAO.saveCustomer(theCustomer);
		
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theid) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theid);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theid) {
		// TODO Auto-generated method stub
		 customerDAO.deleteCustomer(theid);
		
	}

}
