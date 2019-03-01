package com.capgemini.xyz.dao;

import java.util.HashMap;
import java.util.Random;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;

public class LoneDao implements ILoneDao {

	@Override
	public Loan applyLoan(Loan loan) {
		
		 HashMap<Integer,Loan>loanEntry=new HashMap<>();
		 int loanId=0;
			Random rand= new Random();
			 loanId=rand.nextInt();
			 loan.setLoanID(loanId);
			 loanEntry.put(loanId, loan);
		return loanEntry.get(loanId);
	}

	@Override
	public Customer insertCust(Customer cust) {
		int custId=0;
		Random rand= new Random();
		 custId=rand.nextInt();
	HashMap<Integer,Customer>customerEntry=new HashMap<>();
		cust.setCustId(custId);
	customerEntry.put(custId, cust);
	return customerEntry.get(custId);
	}

}
