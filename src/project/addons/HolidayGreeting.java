package project.addons;
import project.application.*;

public class HolidayGreeting implements SecondaryHeading {
	public boolean applies(PurchasedItems items) {
	
	return true; // SecondaryHeading decorators always applied
	}
	public String getLines() {
	
	return "* Happy Holidays from Best Buy *";
	}
	//test
}
