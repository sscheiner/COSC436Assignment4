package project.client;
import project.receipt.*;
import project.items.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Client{
	
	public static void main(String[] args)
	{
		// 1. Creates a Data object (either from Java API or date entered by user)
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dateObject = new Date();
		String date = dateFormat.format(dateObject);
		
		// 2. Creates a PurchasedItems object (selections made by user)
		//we will presume the customer purchases a computer mouse, headphones, and a pack of ethernet cables
		StoreItem mouse = new StoreItem("1406", "laser mouse", "14.95");
		StoreItem headphone = new StoreItem("1202", "usb headphones", "25.99");
		StoreItem cables = new StoreItem("1969", "ethernet cbl 5 pack", "9.99");
		PurchasedItems items = new PurchasedItems();
		items.addItem(mouse);
		items.addItem(headphone);
		items.addItem(cables);
		
		
		
		// 3. Constructs a ReceiptFactory object.
		ReceiptFactory factory = new ReceiptFactory();
		//Receipt receipt = factory.getReceipt(items, date);
		//receipt.prtReceipt();
		
		// 3. Prompts user for items to purchase, storing each in PurchasedItems.
		
		
		// 4. Calls the getReceipt method of the factory to obtain constructed receipt.
		// 5. Prints receipt by call to method prtReceipt.
		// get receipt date
		// (prompt user for current date)
		// display all available store items to user)
		// get all user selections
		

		System.out.println("finished");
	}	
}