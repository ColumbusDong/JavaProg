public class Card
{
	/*Instance Variables*/
	private String suit;	//Holds Card Suit
	private String rank;	//Holds Card Rank
	private int pointValue; //Holds Card Point Value

	/*Regular Constructor*/
	/*
		@param cardRank		String that contains card rank
		@param cardSuit		String that contains card suit
		@param cardPV		Integer that contains card point value
	*/
	public Card(String cardRank, String cardSuit, int cardPV)
	{
		/*Activity 1*/
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPV;
	}

	/*Compare Cards*/
	/*
		Description: Compares current card with another card
		@param 	otherCard	Card that contains the other card
		@return				returns whether the cards are the exact same or different with true/false
	*/
	public boolean matches(Card otherCard)
	{
		/*Activity 1*/
		return (rank.equals(otherCard.rank()) && suit.equals(otherCard.suit()) && pointValue == otherCard.pointValue());
	}

	/*Output*/
	/*
		Description: 	Prints a string in the format: "[Rank] of [Suit] (Point Value = [pointValue])"
		@returns		returns a string containing the rank, suit, and the point value of the card
	*/
	@Override	//Alert of Errors
	public String toString()
	{
		/*Activity 1*/
		return rank + " of " + suit + " (Point Value = " + pointValue + ")";
	}

	/*Accessors - Start*/

	//	@return 	returns card suit
	public String suit()
	{
		/*Activity 1*/
		return suit;
	}

	//	@return 	returns card rank
	public String rank()
	{
		/*Activity 1*/
		return rank;
	}

	//	@return 	returns card point value
	public int pointValue()
	{
		/*Activity 1*/
		return pointValue();
	}

	/*Accessors - End*/
}
