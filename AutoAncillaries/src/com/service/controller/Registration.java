package com.service.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.dao.DAOOperationsImpl;
import com.service.model.Customer;
import com.service.model.Dealer;

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("Login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Customer customer = (Customer) request.getAttribute("customer");
		Dealer dealer = (Dealer) request.getAttribute("dealer");
		DAOOperationsImpl daoObj = new DAOOperationsImpl();
		String msg, msg1;
		if (customer != null) {
			try {
				if (!daoObj.checkUserId(customer.getCustomerId())) {
					msg1 = "Username already taken";
					request.setAttribute("msg", msg1);
					request.getRequestDispatcher("Registration.jsp").forward(request, response);
				} else {
					if (daoObj.registerCustomer(customer)) {
						msg = "Registration succefull now login to contnue";
						request.setAttribute("msg",msg);
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					} else {
						msg = "Registration failed try again";
						request.setAttribute("msg",msg);
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if (dealer != null) {
			try {
				System.out.println("dasdasd");
				if (!daoObj.checkUserId(dealer.getDealerId())) {
					msg1 = "Username already taken";
					request.setAttribute("msg", msg1);
					request.getRequestDispatcher("Registration.jsp").forward(request, response);
				} else {
					if (daoObj.registerDealer(dealer)) {
						msg = "Registration succefull now login to contnue";
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					} else {
						msg = "Registration failed try again";
						request.setAttribute("msg",msg);
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
