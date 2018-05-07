package project.TaxComputationClasses;
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
		
		//if it is a tax holiday, tax is 0
		if(taxHoliday(date)) {
			return 0.0;
		}
		
		
		return 0.0;
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
