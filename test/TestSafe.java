/**
 * 
 */
package test;

import buyer.Client;
import safes.*;
import valuables.*;

/**
 * @author ceichler
 *
 */
public class TestSafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Uncomment to synchronyze system out and err
		System.setErr(System.out);

		//Let's create a safe with a capacity of 2 gems
		SafeWithCode mySafe = new SafeWithCode(2,"Coucou");

		Gemstone g = new Ruby(10);
		g.appraisal();
		
		Client c = new Client(1000000);
		c.buy(g);
		Gemstone g2 = new Ruby(40);
		g2.appraisal();
		mySafe.addGem(g2);
		c.buy(mySafe);
		
		Gemstone g1 = g;
		//Gemstone g2 = new RockWithTruc(10);
		Gemstone g3 = new Ruby(10);
		Gemstone g4 = new RockWithTruc(40);
		
		//soucis arrivé en live: + g1==g2 considère g1 comme type à additionné plutôt que (g1==g2)
		System.out.println(g1.equals(g2) + " " + (g1==g2));
		/*
		mySafe.addGem(g);
		System.out.println(mySafe.getMyContent().contains(g2));

		System.out.println(mySafe.getMyContent().size());
		mySafe.addGem(g2);
		System.out.println(mySafe.getMyContent().size());
		
		/*
		//mySafe.addGem(new Ruby(10));
		System.out.println(g.getValue());
		
		/*
		System.out.println(g);
		g.appraisal();
		System.out.println(g.getValue());
		System.out.println(g.toString());
		
		
		((SafeWithCode) mySafe).changeCode("Tata", new String("Coucou"));
		
		
		System.out.println("Test coucou");
		((SafeWithCode) mySafe).open("Coucou");
		System.out.println("Test tata");
		((SafeWithCode) mySafe).open("Tata");
		mySafe.close();
		
		System.out.println("opened? " + mySafe.isOpened());
		
		mySafe.open();
		System.out.println("opened? " + mySafe.isOpened());
		
		/*Test open/close
		System.out.println("Triggering error; trying to open an opened safe");
		mySafe.open();
		System.out.println(mySafe.toString());
		*/
		/*
		mySafe.close();
		if(mySafe.isOpened()) System.err.println("Issue with close");
		System.out.println("Triggering error; trying to close a closed safe");
		mySafe.close();
		
		mySafe.open();
		if(!mySafe.isOpened()) System.err.println("Issue with open");
		mySafe.close();
		
		//Test getValue
		System.out.println("The value of my empty safe is " +mySafe.getValue());
		
		//Creating and adding gems
		Gemstone p1 = new Gemstone(5);
		Gemstone p2 = new Gemstone(6);
		Gemstone p3 = new Gemstone(2);
		
		System.out.println("Triggering error; adding content in a closed safe");
		mySafe.addGem(p1);
		
		mySafe.open();
		mySafe.addGem(p1);
		mySafe.addGem(p2);
		System.out.println("Triggering error; adding content in a full safe");
		mySafe.addGem(p3);
	
		System.out.println("The value of my safe before expertize is " +mySafe.getValue());
		
		p1.expertize();
		p2.expertize();
		System.out.println("The value of my safe after expertize is " +mySafe.getValue());
		*/
	}

}