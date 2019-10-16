package tyreso.gymnasium.cardgame;

public class Deck {

    int maxSize;
    Card[] deck;

    public Deck(){
        this.maxSize = 52;
        this.deck = new Card[52];

        int tempValue = 1;
        for (int i = 0; i < deck.length; i++){
            if (tempValue > 13){
                tempValue = 1;
            }
            Card tempCard = new Card("Hearts", tempValue, false);
            deck[i] = tempCard;
            tempValue++;    //increment the value of the card by one
        }





    }

}
