import java.util.List;

public class PlayedHand{
    
    List<Card> playedCards;
    String handType;
    int level;
    
    
    public List<Card> getPlayedCards() {
        return playedCards;
    }

    public void setPlayedCards(List<Card> playedCards) {
        this.playedCards = playedCards;
    }


    public String getHandType() {
        return handType;
    }

    public void setHandType(String handType) {
        this.handType = handType;
    }

    public PlayedHand(List<Card> playedCards, String handType, int level) {
        this.playedCards = playedCards;
        this.handType = handType;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        String string = "PLAYED HAND\n";
        int idx = 1;
        for(Card card: this.playedCards){
            string += card.toString(idx) + "\n";
            idx++;
        }
        string += "\nHand Type: " + this.handType + "\n"
        + "Level: " + this.level;

        return string;
    }
 
}