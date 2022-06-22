package com.empapp;

public class Invoice implements Payable{
	private int invoiceId;
	private String consultantName;
	private double consultantGst;
	
	private int noOfDays;
	private int payPerDay;
	
	
	public Invoice(int invoiceId, String consultantName, double consultantGst, int noOfDays, int payPerDay) {
		
		this.invoiceId = invoiceId;
		this.consultantName = consultantName;
		this.consultantGst = consultantGst;
		this.noOfDays = noOfDays;
		this.payPerDay = payPerDay;
	}
	
	public void printInvoiceInformation() {
		System.out.println("invoice id : "+ invoiceId+" consultantName: "+ consultantName+"consultantGst: "+ consultantGst);
	}

	@Override
	public double getTotalPayable() {
		return noOfDays*payPerDay;
	}
	
	
}
