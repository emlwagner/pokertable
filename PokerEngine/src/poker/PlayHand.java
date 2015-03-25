package poker;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PlayHand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many jokers are in the deck?");
		int jokers = input.nextInt();
		
		System.out.println("How many players?");
		int nbrHands = input.nextInt();

		for (int gCount = 0; gCount <= 2000000; gCount++) {
			ArrayList<Hand> Hands = new ArrayList<Hand>();
			
			Deck d = new Deck(jokers);

			for (int hCnt = 0; hCnt <= nbrHands; hCnt++) {
				Hand h = new Hand(d);
				h.EvalHand();
				Hands.add(h);
			}
			Collections.sort(Hands, Hand.HandRank);
			
			try {
				System.out.println(Hand.PickBestHand(Hands));
			} 
			catch (exHand e) {
				System.out.println("It's a tie!");
			}

			System.out
					.print("Hand Strength: " + Hands.get(0).getHandStrength());
			System.out.print(" Hi Hand: " + Hands.get(0).getHighPairStrength());
			System.out.print(" Lo Hand: " + Hands.get(0).getLowPairStrength());
			System.out.print(" Kicker: " + Hands.get(0).getKicker());

			System.out.print(" beats ");

			System.out.print(" Hand Strength: "
					+ Hands.get(1).getHandStrength());
			System.out.print(" Hi Hand: " + Hands.get(1).getHighPairStrength());
			System.out.print(" Lo Hand: " + Hands.get(1).getLowPairStrength());
			System.out.print(" Kicker: " + Hands.get(1).getKicker());

			System.out.print("\n");
			input.close();
		}

	}
	
	
}
