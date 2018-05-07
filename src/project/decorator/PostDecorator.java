package project.decorator;

import project.addons.AddOn;
import project.receipt.Receipt;

public class PostDecorator extends Decorator{
		
		private AddOn a;
		
		public PostDecorator(Receipt r, AddOn a) {
			super(r, a);
			this.a = a;
		}
		
		public void prtReceipt() {
			callTrailer();
			System.out.println(a.getLines());
			
		}
		
	}
