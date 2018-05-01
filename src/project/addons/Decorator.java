package project.addons;
import project.receipt.*;

public abstract class Decorator implements Receipt {
	private Receipt trailer;
	private AddOn addOn;
	
	public Decorator(Receipt r, AddOn a) {
		trailer = r;
		addOn = a;
	}
	protected void callTrailer() {
		trailer.prtReceipt();
	}
	public abstract void prtReceipt();
}
