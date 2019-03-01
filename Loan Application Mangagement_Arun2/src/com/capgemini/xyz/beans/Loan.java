package com.capgemini.xyz.beans;

public class Loan {
	private long loanID;
	private double loanAmount;
	private long custId;
	private int duration;
	public long getLoanID() {
		return loanID;
	}
	public void setLoanID(long loanID) {
		this.loanID = loanID;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Loan(double loanAmount, int duration) {
		super();
		this.loanAmount = loanAmount;
		this.duration = duration;
	}
	public Loan(double loanAmount, long custId, int duration) {
		super();
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;
	}
	public Loan(long loanID, double loanAmount, long custId, int duration) {
		super();
		this.loanID = loanID;
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Loan [loanID=" + loanID + ", loanAmount=" + loanAmount + ", custId=" + custId + ", duration=" + duration
				+ "]";
	}

	

}
