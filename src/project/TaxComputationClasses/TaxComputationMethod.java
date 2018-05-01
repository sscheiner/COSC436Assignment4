package project.TaxComputationClasses;
import project.application.PurchasedItems;
import project.receipt.*;

public abstract class TaxComputationMethod {
	public abstract double computeTax(PurchasedItems items, ReceiptDate date);
	public abstract boolean taxHoliday();
}
