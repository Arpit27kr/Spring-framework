package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//need to inject dao 
	
//need to inject customer service
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listcustomer(Model theModel)
	{
		
		//get customers from dao
		List<Customer>thecustomer=customerService.getCustomer();
		
		// add customer in mvc model
		
		theModel.addAttribute("customers",thecustomer);
		
		return "list-customer";
		
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model themodel )
	{
		
		Customer thecustomer=new Customer();
		themodel.addAttribute("customer",thecustomer);
		
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list"; 
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theid,
			                          Model themodel)
	{
		
		/// get the customer from database
		
		Customer theCustomer =customerService.getCustomer(theid);
		//set customer as model attribute  for prepopulate 
		themodel.addAttribute("customer", theCustomer);
		
		// send over to our form 
		
	return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId")int theid)
	{
		customerService.deleteCustomer(theid);
		
		return "redirect:/customer/list";
		
	}

	
	
	
	
	
	
	
	

}
