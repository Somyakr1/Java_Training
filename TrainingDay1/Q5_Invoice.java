package com.TrainingDay2;

public class Q5_Invoice implements Q5_Payable{
	private String invoiceId;
	private String itemDescription;
	private int quantity;
	private double pricePerUnit;
	
	public Q5_Invoice(String invoiceId, String itemDescription, int quantity, double pricePerUnit) {
		this.invoiceId = invoiceId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	@Override 
	public double getPayment(){
		return quantity * pricePerUnit;
	}
	
	public String getInvoiceId() {
		return invoiceId;
	}
}
