package project.items;

public class StoreItem {
	private String itemCode; // e.g., 3010
	private String itemDescription; // e.g., Dell Laptop
	private String itemPrice;
	
	public StoreItem(String code, String descript, String price){
		
	}
	// appropriate getters and setters

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
}