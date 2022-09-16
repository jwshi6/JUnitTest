package poker;

public class Poker {
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1))
					return true;
		}

		return false;
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		boolean HasaPair = false;
		for (int i=0; i<n-1;i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				if(HasaPair&&cards[i].charAt(1)==cards[i-1].charAt(1)) {
					continue;
				}
				count++;
				HasaPair = true;
			}
		}	
		if (count == 2)
			return true;
		else
			return false;
	}
	
}
// end of Poker.java
