package tyreso.gymnasium.cardgame;

public class TestDeck {
    public static void main(String[] args){
        Deck testDeck = new Deck();

        for (Card card : testDeck.deck){
            System.out.println(card.value + " " + card.suit);
        }

    }
}
