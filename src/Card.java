public class Card {
    String rank;
    String suit;
    int chips;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() { 
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
    
    public static Card newCard(){
        Card card = new Card();
        card.setRank("A");
        card.setChips(11);
        card.setSuit("Spade");

        return card;
    }

    
    public static Card newCard(String rank, int chips, String suit){
        Card card = new Card();
        card.setRank(rank);
        card.setChips(chips);
        card.setSuit(suit);

        return card;
    }

    public String toString(int idx){
        String string = "Card " + idx + "\nRank: " + this.rank + "\nSuit: " + this.suit;
        return string;
    }
}
