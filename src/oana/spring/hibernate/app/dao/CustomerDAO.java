package oana.spring.hibernate.app.dao;

import java.util.List;

import oana.spring.hibernate.app.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
}