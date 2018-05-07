package project.addons;
import project.items.*;
import java.util.Date;

public class HolidayGreeting implements SecondaryHeading {
	
	public boolean applies(PurchasedItems items) {
		Date dateObject = new Date();
		if(dateObject.getMonth() == 12) {
			return true;
		}
		
		return true; // SecondaryHeading decorators always applied
	}
	public String getLines() {
	
	return "* Happy Holidays from Best Buy *";
	}
	//test
}
