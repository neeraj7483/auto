package com.service.dao;

import java.sql.SQLException;

import com.service.model.Customer;
import com.service.model.Dealer;

public interface DAOOperations {

	public Customer checkCustomer(String id,String password) throws SQLException;
	public Dealer checkDealer(String id,String password) throws SQLException;
	public boolean checkManager(String id,String password);
	public boolean registerDealer(Dealer dealer) throws SQLException;
	public boolean registerCustomer(Customer customer) throws SQLException;
	public boolean checkUserId(String id) throws SQLException;
}
