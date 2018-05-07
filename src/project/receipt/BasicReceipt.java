package project.receipt;

import java.util.Date;

import project.TaxComputationClasses.*;
import project.items.*;

public class BasicReceipt implements Receipt {
	private StoreHeader store_header; // street address, state code, phone number, store number
	private TaxComputationMethod tc;
	private Date date; // may also be a String type
	private ReceiptDate rDate;
	private PurchasedItems items;
	
	public BasicReceipt(PurchasedItems items, Date date) { // Date may also be a String type
		this.items = items;
		rDate = new ReceiptDate();
		rDate.setDate(date);
	}
	
	public void setStoreHeader(StoreHeader h) {
		store_header = h;
	}
	
	public void setTaxComputationMethod(TaxComputationMethod tc) {
		this.tc = tc;
	}
	
	public void prtReceipt() {
		//calculate the taxes
		double salesTax = tc.computeTax(items, rDate);
		double subTotal = 0.0;
		
		System.out.println(store_header.toString());
		
		for(StoreItem x : items.getItems()) {
			System.out.println(x);
			subTotal += Double.parseDouble(x.getItemPrice());
		}
		
		System.out.printf("\nSubtotal: \t\t$%.2f", subTotal);
		System.out.printf("\nSales tax: \t\t$%.2f", salesTax);
		System.out.printf("\nTotal: \t\t$%.2f\n\n", subTotal + salesTax);
	}
	
}