package com.capgemini.xyz.service;

import javax.security.auth.login.AccountNotFoundException;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;

public interface ILoneService {
	public Loan applyLoan(Loan loan);
	public boolean validateCustomer(Customer customer) throws AccountNotFoundException;
	public Customer insertCust(Customer cust);
	public double  calculateEMI(double amount,int duration);
	

}
