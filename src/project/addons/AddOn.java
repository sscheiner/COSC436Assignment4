package project.addons;

import project.items.PurchasedItems;

public interface AddOn {

	public boolean applies(PurchasedItems items);
	public String getLines();
	
}
