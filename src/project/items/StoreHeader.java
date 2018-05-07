package project.items;

public class StoreHeader {
	private String street_addr;
	private String zip_code;
	private String state_code;
	private String phone_num;
	private String store_num; // e.g., #1004
	public StoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num){
		
	}
	
	public String getStateCode() {
		return state_code;
	}
	
	public String toString() {
		//TODO: implement
		return "BEST BUY \t\t\t Store #" + store_num + "\n"
				+ street_addr + " " + zip_code + "\n"
				+"\t\t" + phone_num;
	}
}
