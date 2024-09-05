public class Card {
    private int value;   // Value of the card
    private String suit; // Suit of the card
    private String rank; // Rank of the card

    // Constructor
    public Card(int value, String suit, String rank) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter for rank
    public String getRank() {
        return rank;
    }

    // Setter for rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    // toString method to represent the card as a string
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
