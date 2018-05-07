package project.client;
import project.receipt.*;
import project.items.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
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
		PurchasedItems purchasedItems = new PurchasedItems();
		
		// 3. Constructs a ReceiptFactory object.
		ReceiptFactory factory = new ReceiptFactory();
		//testing
		//Receipt receipt = factory.getReceipt(items, date);
		//receipt.prtReceipt();
		
		// 3. Prompts user for items to purchase, storing each in PurchasedItems.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item code to add to shopping cart, enter f when finished");
		StoreItems storeItems = new StoreItems();
		List<StoreItem> itemsList = storeItems.getItemList(); 
		
		//print out items in list
		for(StoreItem x : itemsList){
			System.out.println(x.toString());
		}
		
		String input = "";
		
		while(!input.equals("f")) {
			
			//
			System.out.println("Enter item code to add to shopping cart, enter f when finished");
			
			//listen for input
			input = sc.next();
			
			//double check input
			if(storeItems.containsItem(input)) {
				//get the item and add it to purchaseditems
				for(StoreItem x : itemsList){
					if(x.getItemCode().equals(input)) {
						purchasedItems.addItem(x);
					}
				}
			}
			else {
				System.out.println("invalid input");
			}
		}
		//testprint purchased items
		/*
		for(StoreItem x : purchasedItems.getItems()){
			System.out.println(x.toString());
		}
		*/
		
		// 4. Calls the getReceipt method of the factory to obtain constructed receipt.
		Receipt result = factory.getReceipt(purchasedItems, dateObject);
		
		// 5. Prints receipt by call to method prtReceipt.
		result.prtReceipt();
		
		// get receipt date
		// (prompt user for current date)
		// display all available store items to user)
		// get all user selections
		

		System.out.println("finished");
	}	
}