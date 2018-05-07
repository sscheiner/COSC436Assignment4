package project.receipt;
import project.addons.*;
import project.items.*;
import project.TaxComputationClasses.*;

import java.io.*;
import java.util.*;

public class ReceiptFactory {

	public static final String CFGFILENAME = "examplestore.txt";
	
	
	private StoreHeader store_header; // contains street_addr, zip_code, state_code, phone num, store num
	private TaxComputationMethod taxComputer; //initialized at runtime
	private AddOn[] addOnArray;
	BasicReceipt basicReceipt;
	
	public ReceiptFactory() { 
	// constructor
	// 1. Populates array of TaxComputationMethod objects and array of AddOn objects (as if downloaded from the BestBuy web site).
		TaxComputationMethod[] taxComputationMethodArray = {new MDTaxComputation(), new CATaxComputation()};
		AddOn[] temp = {new HolidayGreeting(), new Rebate1406()};
		addOnArray = temp; //array constants can only be used in initializers
		
	// 2. Reads config file to create and save StoreHeader object (store_num, street_addr, etc.) to be used on all receipts.

		ArrayList<String> storeInfo = new ArrayList<String>();
		File storeConfig = new File(CFGFILENAME);
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(storeConfig));
			String line;
		    while ((line = br.readLine()) != null) {
		       storeInfo.add(line);
		    }
		    
		} catch (Exception e) {
			//auto-generated
			e.printStackTrace();
		} 
		
		//done with file reading, parse lines into properties
		String streetAddress = storeInfo.get(0);
		String state = storeInfo.get(1);
		String zip = storeInfo.get(2);
		String year = storeInfo.get(3);
		String phone = storeInfo.get(4);
		
		store_header = new StoreHeader(streetAddress, zip, state, year, phone);
		
		//test print
		//System.out.println(streetAddress +"\n" + state +"\n" + zip +"\n" + year +"\n" + phone);
		
		// 3. Based on the state code creates and stores appropriate StateComputation object to be used on all receipts.

		switch(state) {
			case "MD": taxComputer = new MDTaxComputation();
				
				break;
			
			case "CA": taxComputer = new CATaxComputation();
				
				break;
	
			default: System.out.println("invalid state code, ReceiptFactory failed");
				return;
		}
	}
	
	public Receipt getReceipt(PurchasedItems items, Date date) {
	// 1. Sets the current date of the BasicReceipt.
		basicReceipt = new BasicReceipt(items, date); 
		
	// 2. Sets StoreHeader object of the BasicReceipt (by call to SetStoreHeader of BasicReceipt)
		basicReceipt.setStoreHeader(store_header);
		
	// 3. Sets the TaxComputationMethod object of the BasicReceipt (by call to the setTaxComputationMethod of BasicReceipt).
		basicReceipt.setTaxComputationMethod(taxComputer);
		
	// 4. Traverses over all AddOn objects, calling the applies method of each.
	//If an AddOn object applies, then determines if the AddOn is of type SecondaryHeader, Rebate,
	//or Coupon.If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. 
	//If of type Rebate orCoupon, then creates a PostDecorator.
		for(int i = 0; i < addOnArray.length; i++) {
			if(addOnArray[i].applies(items){
				if(addOnArray[i] instanceof SecondaryHeading) {
										
				}
				else if()
				
				
				
			}
			
			
		}
		
	// 5. Links in the decorator object based on the Decorator design pattern.
	// 6. Returns decorated BasicReceipt object as type Receipt.
	
		//TODO: implement
		return basicReceipt;
	}
	
}
