package project.TaxComputationClasses;

import java.util.ArrayList;
import java.util.Date;

import project.items.PurchasedItems;
import project.items.StoreItem;
import project.receipt.ReceiptDate;

public class CATaxComputation extends TaxComputationMethod {
    
	public double getSalesTax(){
        return 0.075;
    }

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		// calls private method taxHoliday as part of this computation
		//TODO: implement
		double totalSalesTax = 0.0;
		//if it is a tax holiday, tax is 0
		if(taxHoliday(date)) {
			return 0.0;
		}
		else {
			ArrayList<StoreItem >itemsList = items.getItems();
			for(StoreItem x : itemsList){
				double itemPrice = Double.parseDouble(x.getItemPrice());
				totalSalesTax += getSalesTax() * itemPrice;
			}
		}
		
		
		return 0.0;
	}

	@Override
	public boolean taxHoliday(ReceiptDate date) {
		//no tax holiday in california
		return false;		
	}

}