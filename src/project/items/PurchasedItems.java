package project.items;

import java.util.*;

public class PurchasedItems {
	private ArrayList<StoreItem> items;
	
	public PurchasedItems() {
		items = new ArrayList<>();
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

	public ArrayList<StoreItem> getItems() {
		return items;
	}
}
