package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestNaturalRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}

	@Test
	public final void TestRoyalFlushWithJoker() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestRoyalFlushWithJokers2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestRoyalFlushWithJoker3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestRoyalFlushWithJokers4() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestRoyalFlushWithJoker5() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraightFlushWithJoker() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight flush:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraightFlushWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight flush:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraightFlushWithJokers3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight flush:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFiveOfAKind() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 5 of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFiveOfAKind2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 5 of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFiveOfAKind3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 5 of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFourOfAKindWithJokers() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 4 of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFourOfAKindWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 4 of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFourOfAKind() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 4 of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFullHouse() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFullHouseWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFullHousewithJokers3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.TWO));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFlush() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFlushWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestFlushWithJokers3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraight() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraightwithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestStraightwithJokers3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestThreeOfAKind() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.SPADES,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 3 of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestThreeOfAKindWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 3 of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void ThreeOfAKindWithJokers3() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.SPADES,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be 3 of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestTwoPair() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be two pair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestTwoPairWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be two pair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestOnePair() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.SPADES,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());
		
	}
	@Test
	public final void TestOnePairWithJoker2() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());
		
	}
	@Test
    public final void TestHighCard() {
        
        ArrayList<Card> rfHand = new ArrayList<Card>();
        rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
        rfHand.add(new Card(eSuit.DIAMONDS, eRank.SIX));
        rfHand.add(new Card(eSuit.SPADES, eRank.FOUR));
        rfHand.add(new Card(eSuit.SPADES, eRank.TWO));
        rfHand.add(new Card(eSuit.HEARTS, eRank.NINE));
        Hand h = Hand.EvalHand(rfHand);    
        
        assertEquals("Should be high card:", eHandStrength.HighCard.getHandStrength(), h.getHandStrength());
        
        
    }
}


