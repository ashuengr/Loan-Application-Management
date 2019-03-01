package com.capgemini.xyz.dao;

import java.util.HashMap;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;

public interface ILoneDao {
static HashMap<Integer,Customer>customerEntry=new HashMap<>();
 static HashMap<Integer,Loan>loanEntry=new HashMap<>();
	public Loan applyLoan(Loan loan);
	public Customer insertCust(Customer cust);
	

}
