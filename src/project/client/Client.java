package project.client;

public static void main(String[] args)
{
	// 1. Creates a Data object (either from Java API or date entered by user)
	// 2. Creates a PurchasedItems object (selections made by user)
	// 3. Constructs a ReceiptFactory object.
	// 3. Prompts user for items to purchase, storing each in PurchasedItems.
	// 4. Calls the getReceipt method of the factory to obtain constructed receipt.
	// 5. Prints receipt by call to method prtReceipt.
	// get receipt date
	// (prompt user for current date)
	// display all available store items to user)
	// get all user selections
	
	ReceiptFactory factory = new ReceiptFactory();
	Receipt = factory.getReceipt(items, date);
	receipt.prtReceipt();
	
}
