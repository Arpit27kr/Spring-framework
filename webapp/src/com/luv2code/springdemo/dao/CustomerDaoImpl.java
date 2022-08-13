package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	@Override
	
	public List<Customer> getCustomer() {
		
		//get current hibernate session
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		
		// create quesrry
		
		Query<Customer>thequery=currentSession.createQuery("from Customer order by firstname ", Customer.class);
		
		
		// execute querry
		
		List<Customer>customers=thequery.getResultList();
		
		
		
		//return list of customers 
		
		
		
		return customers;
	}
	
	public void saveCustomer(Customer theCustomer)
	{
		
		Session CurrentSession=sessionFactory.getCurrentSession();
		
		CurrentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theid) {
		// TODO Auto-generated method stub
		
		// get the current hibernate session 
		
		Session Currentsession =sessionFactory.getCurrentSession();
		// now retrieve/read from database using the primary key id 
		Customer theCustomer=Currentsession.get(Customer.class, theid);
		
		return theCustomer;
		
		
		
	
	}

	public void  deleteCustomer(int theid) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Query theQuery=currentSession.createQuery("delete from Customer where id=:customerId");
		
		theQuery.setParameter("customerId", theid);
	  	theQuery.executeUpdate();
	  	
	
	}
	

}
