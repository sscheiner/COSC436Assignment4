package project.TaxComputationClasses;

import project.application.PurchasedItems;

public abstract class TaxComputationMethod {
	public abstract double computeTax(PurchasedItems items, ReceiptDate date);
	public abstract boolean taxHoliday();
}
