package com.capgemini.xyz.service;

import java.util.HashMap;

import javax.security.auth.login.AccountNotFoundException;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.dao.ILoneDao;
import com.capgemini.xyz.dao.LoneDao;
import com.capgemini.xyz.exceptions.InValidAddressException;
import com.capgemini.xyz.exceptions.InValidEmailException;
import com.capgemini.xyz.exceptions.InvalidMobileNoException;
import com.capgemini.xyz.exceptions.InvalidNameException;

public class LoneService implements ILoneService {
	ILoneDao dao=new LoneDao();

	@Override
	public Loan applyLoan(Loan loan) {

		return dao.applyLoan(loan);
	}

	@Override
	public boolean validateCustomer(Customer customer) {
		if(!(customer.getEmail().contains("@gmail.com"))) {
			throw new InValidEmailException("it is invalid email address");
			
			
			
		}
		String str=String.valueOf(customer.getMobile());
		if(!(str.length()==10))
		{
			throw new InvalidMobileNoException("mobile number is invalid");
		}
		
		return true;
	}


	@Override
	public Customer insertCust(Customer cust) {

		return dao.insertCust(cust);
	}

	@Override
	public double calculateEMI(double amount, int duration) {

		double emi=0;
		return emi=amount*.095*(1+.095)*duration/((1+.095)*duration-1);
	}

}
