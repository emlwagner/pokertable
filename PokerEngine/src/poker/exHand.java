package poker;

import java.util.ArrayList;

public class exHand extends Exception {
	private Hand h1;
	private Hand h2;
	
	public exHand(Hand h1, Hand h2) {
		super("Top two hands equal.");
		this.h1 = h1;
		this.h2 = h2;
	}
	
	public ArrayList<Hand> getHands() {
		ArrayList<Hand> hands = new ArrayList();
		hands.add(this.h1);
		hands.add(this.h2);
		return hands;
		
	}
	

}
