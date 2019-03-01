package com.capgemini.xyz.ui;

import java.util.Scanner;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.exceptions.InValidEmailException;
import com.capgemini.xyz.exceptions.InvalidMobileNoException;
import com.capgemini.xyz.service.LoneService;

public class ExecuterMain {

	LoneService ls= new LoneService();
	public void getCustDetails() {
		Scanner sc=sc = new Scanner(System.in);
		Customer customer = null;
		try {
			
			System.out.println("Enter Customer Name");
			String name=sc.next();
			System.out.println("Enter Address");
			String add=sc.next();
			System.out.println("Enter Email");
			
			String email=sc.next();
			System.out.println("Enter mobile number");
			long mob=sc.nextLong();
			customer = new Customer(name, add, mob, email);
			
			ls.validateCustomer(customer);
			ls.insertCust(customer);
			System.out.println(customer.getCustId());
			//System.out.println(customer);
			//System.out.println(ls.insertCust(customer));
			System.out.println("Customer information saved successfully");
		} catch (InValidEmailException e) {
			
			e.printStackTrace();
		}
		
		catch(InvalidMobileNoException e)
				{
			e.printStackTrace();
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Do you wish  to apply for loan?(Yes/No)");
		
		String opt=sc.next();
		if(opt.equals("Yes")) {
		System.out.println("Enter the loan amount");
		double loanAmount=sc.nextDouble();
		System.out.println("Enter the loan duration");
		
		int duration=sc.nextInt();
		Loan loan =new Loan(loanAmount, duration);
		//ls.applyLoan(loan);
		System.out.println(ls.applyLoan(loan));
		System.out.println("For loan amount<"+loanAmount+">and "+duration+"Years duration");
		System.out.println("Your emi per month will be"+ls.calculateEMI(loanAmount, duration));
		System.out.println("Do you want to apply for loan now(Yes/No");
		String opt1=sc.next();
		if(opt1.equals("Yes")) {
			ls.applyLoan(loan);
			System.out.println("Your loan request is generated\nYour Loan ID is"+ls.applyLoan(loan).getLoanID());
		}
		
		if(opt.equals("No"))
		{
	System.out.println(ls.insertCust(customer));
		}}

	}

	public static void main(String[] args) {
		ExecuterMain em=new ExecuterMain();

		boolean flag=true;
		while(flag)
		{
			System.out.println("XYZ finance company welcome you");
			System.out.println("Enter 1.   Register Customer");
			System.out.println("2. Exit");
			Scanner sc= new Scanner(System.in);
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				em.getCustDetails();
				break;

			case 2:
				System.exit(ch);
				flag=false;
				break;
			default:
				System.out.println("   ");
			}
		}




	}}
