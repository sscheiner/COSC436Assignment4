package project.TaxComputationClasses;
import project.items.*;
import project.receipt.*;

public class MDTaxComputation extends TaxComputationMethod {

	
	private boolean taxHoliday(ReceiptDate date) {
		//TODO: implement
		return false;
	};
	// returns true if date of receipt within the state’s tax free holiday,
	// else returns false. Supporting method of method computeTax.
	
	public double getSalesTax(){
        return 0.06;
    }

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		// calls private method taxHoliday as part of this computation
		//TODO: implement
		return 0.0;
	}

	@Override
	public boolean taxHoliday() {
		// TODO Auto-generated method stub
		return false;
	}

}
