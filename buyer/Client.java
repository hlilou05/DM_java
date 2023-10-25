package buyer;

import java.util.ArrayList;
import java.util.Collection;

import valuables.Valuable;

public class Client {
	
	private double currBudget = 10000;
	private Collection<Object> myPossessions = new ArrayList<Object>();
	
	public Client(double budget) {
		this.currBudget= budget;
	}
	
	public void buy(Valuable val) {
		if(!(val.getValue()>this.currBudget)) {
			this.currBudget-=val.getValue();
			this.myPossessions.add(val);
			System.out.println("Achat réussi! Nouveau budget " + this.currBudget);
		}
		else System.out.println("You're too poor");
	}
	
}
