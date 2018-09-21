package com.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.service.model.Address;
import com.service.model.Customer;
import com.service.model.Dealer;
import com.service.utility.ConnectionProvider;

public class DAOOperationsImpl implements DAOOperations {

	public Customer checkCustomer(String id, String password) throws SQLException {
		Customer customer = null;
		Address address = new Address();
		String query1 = "select * from customers where customerid=? and password=?";
		String query2 = "select * from address where userid=?";
		Connection con = ConnectionProvider.getConnection();
		PreparedStatement ps1 = con.prepareStatement(query1);
		ps1.setString(1, id);
		ps1.setString(2, password);
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setString(1, id);
		ResultSet rs1 = ps1.executeQuery();
		ResultSet rs2 = ps2.executeQuery();
		if (rs2.next()) {
			address.setStreetAddress(rs2.getString(2));
			address.setState(rs2.getString(3));
			address.setPincode(rs2.getString(4));
		}
		if (rs1.next()) {
			customer = new Customer();
			customer.setCustomerId(rs1.getString(1));
			customer.setPassword(rs1.getString(2));
			customer.setName(rs1.getString(3));
			customer.setEmail(rs1.getString(4));
			customer.setLocation(rs1.getString(5));
			customer.setContactNo(rs1.getString(6));
			customer.setAddress(address);
		}
		return customer;
	}

	public Dealer checkDealer(String id, String password) throws SQLException {
		Dealer dealer = null;
		Address address = new Address();
		String query1 = "select * from customers where customerid=? and password=?";
		String query2 = "select * from address where userid=?";
		Connection con = ConnectionProvider.getConnection();
		PreparedStatement ps1 = con.prepareStatement(query1);
		ps1.setString(1, id);
		ps1.setString(2, password);
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setString(1, id);
		ResultSet rs1 = ps1.executeQuery();
		ResultSet rs2 = ps2.executeQuery();
		if (rs2.next()) {
			address.setStreetAddress(rs2.getString(2));
			address.setState(rs2.getString(3));
			address.setPincode(rs2.getString(4));
		}
		if (rs1.next()) {
			dealer.setDealerId(rs1.getString(1));
			dealer.setPassword(rs1.getString(2));
			dealer.setName(rs1.getString(3));
			dealer.setEmail(rs1.getString(4));
			dealer.setLocation(rs1.getString(5));
			dealer.setContactNo(rs1.getString(6));
			dealer.setRating(rs1.getInt(7));
			dealer.setAddress(address);

		}
		return dealer;
	}

	public boolean checkManager(String id, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean registerDealer(Dealer dealer) throws SQLException {
		String query = "insert into dealers values(?,?,?,?,?,?,?)";
		Connection con = ConnectionProvider.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, dealer.getDealerId());
		ps.setString(2, dealer.getPassword());
		ps.setString(3, dealer.getName());
		ps.setString(4, dealer.getEmail());
		ps.setString(5, dealer.getLocation());
		ps.setString(6, dealer.getContactNo());
		ps.setInt(7, 3);
		int i = ps.executeUpdate();
		if (i > 0)
			return true;
		else
			return false;
	}

	public boolean registerCustomer(Customer customer) throws SQLException {
		String query = "insert into customers values(?,?,?,?,?,?)";
		Connection con = ConnectionProvider.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, customer.getCustomerId());
		ps.setString(2, customer.getPassword());
		ps.setString(3, customer.getName());
		ps.setString(4, customer.getEmail());
		ps.setString(5, customer.getLocation());
		ps.setString(6, customer.getContactNo());
		int i = ps.executeUpdate();
		if (i > 0)
			return true;
		else
			return false;

	}

	public boolean checkUserId(String id) throws SQLException {
		String query1 = "select dealerId from dealers where dealerId=?";
		String query2 = "select customerId from customers where customerId=?";
		Connection con = ConnectionProvider.getConnection();
		PreparedStatement ps1 = con.prepareStatement(query1);
		ps1.setString(1, id);
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setString(1, id);
		ResultSet rs1 = ps1.executeQuery();
		ResultSet rs2 = ps2.executeQuery();
		if ((rs1.next()==true) || (rs2.next()==true)) {
			return false;
		} else
			return true;
	}

}
