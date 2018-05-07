package project.items;

import java.util.*;

public class StoreItems {
	private ArrayList<StoreItem> items;
	
	public StoreItems() {
		items = new ArrayList<>();
		
		//ideally this would be pulled from an items database
		//we will presume the customer purchases a computer mouse, headphones, and a pack of ethernet cables
		StoreItem mouse = new StoreItem("1406", "laser mouse", "14.95");
		StoreItem headphone = new StoreItem("1202", "usb headphones", "25.99");
		StoreItem cables = new StoreItem("1969", "ethernet cbl 5 pack", "9.99");
		items.add(mouse);
		items.add(headphone);
		items.add(cables);
	}
		
	public void addItem(StoreItem item) {
		items.add(item);
	}
	
	public double getTotalCost() {
		double cost = 0.0;
		
		for(StoreItem i : items) {
			cost += Double.parseDouble(i.getItemPrice());
		}
		
		return cost;
	}
	
	public boolean containsItem(String itemCode) {
		//TODO: implement
		
		for(StoreItem i : items) {
			if(itemCode.equals(i.getItemCode())) {
				return true;				
			}
		}
		
		return false;
	}
	
	public List<StoreItem> getItemList(){
		return items;
	}
}
