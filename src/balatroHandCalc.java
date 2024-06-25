import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class balatroHandCalc{
    
    public static void main(String[] args) {
        PlayedHand playedHand = handPlayed();
        preScore();
        playedHandScore(playedHand);
    }

    public static PlayedHand handPlayed(){
        Card card1 = Card.newCard("T", 10, "Clubs");
        Card card2 = Card.newCard("5", 5, "Diamond");
        //System.out.println(card);
        List<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        String handType = calcHandPlayed(cards);
        PlayedHand playedHand = new PlayedHand(cards, handType, 2);

        return playedHand;
    }


    public static void preScore(){
        System.out.println("In preScore()");
    }

    public static void playedHandScore(PlayedHand playedHand){
        List<Card> cards = playedHand.getPlayedCards();
        int[] chipsAndMult = getChipsAndMult(playedHand.handType, playedHand.level);
        determineScoringCards(playedHand);
        chipsAndMult = addCardsToScore(cards, chipsAndMult);
    }

    public static String calcHandPlayed(List<Card> cards){  
        String handPlayed = "High Card";
        if(cards.size() == 1){
            handPlayed = "High Card";
            System.out.println("Played High Card!");
        }

        return handPlayed;
    }

    public static int[] getChipsAndMult(String handType, int level){
        Map<String, int[]> chipsAndMultTable = Map.ofEntries(
            entry("High Card", new int[] {5,1})
            //add the different hand types here
            );
        int[] chipsAndMult = chipsAndMultTable.get(handType);
        int chips = chipsAndMult[0];
        int mult = chipsAndMult[1];

        System.out.println("LEVEL: " + level);

        Map<String, int[]> levelTable = Map.ofEntries(
            entry("High Card", new int[] {10 *(level-1), 1 * (level-1)})
            //add the different hand type level scaling here
            );
        int[] levelModifiers = levelTable.get(handType);
        int chipsMod = levelModifiers[0];
        int multMod = levelModifiers[1];

        int []finalChipsAndMult = new int[] {chips + chipsMod, mult + multMod};
        for(int num: finalChipsAndMult){
            System.out.println(num);
        }
        return finalChipsAndMult;
    }

    public static List<Card> determineScoringCards(PlayedHand playedHand){
        List<Card> scoringCards = new ArrayList<>();

        

        return scoringCards;
    }

    public static int[] addCardsToScore(List<Card> cards, int[] chipsAndMult){
        int chips = chipsAndMult[0];
        int mult = chipsAndMult[1];

        for(Card card: cards){
            chips += card.getChips();
            System.out.println("Just added " + card.getChips() + " to chips total!");
        }

        int[] cardChipsAndMult = new int[] {chips, mult};
        return cardChipsAndMult;
    }
}
