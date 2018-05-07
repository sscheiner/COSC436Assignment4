package project.TaxComputationClasses;
import java.util.ArrayList;
import java.util.Date;

import project.items.*;
import project.receipt.*;

public class MDTaxComputation extends TaxComputationMethod {

	
	public double getSalesTax(){
        return 0.06;
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
				totalSalesTax += 0.06 * itemPrice;
			}
		}
		
		
		return totalSalesTax;
	}

	@Override
	public boolean taxHoliday(ReceiptDate date) {
		// TODO Auto-generated method stub
		Date dateObject = date.getDate();
		int month = dateObject.getMonth();
		int day = dateObject.getDate();
		
		return (month == 8 && day >= 14 && day <= 20);
		
	}

}
