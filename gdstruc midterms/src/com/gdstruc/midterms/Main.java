package com.gdstruc.midterms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int Deck = 30;

        Random rand = new Random();
        int cardsTaken = rand.nextInt(5);
        int cardsDiscarded = rand.nextInt(5);
        int cardsTaken2 = rand.nextInt(5);

        int take = cardsTaken;
        int discard = cardsDiscarded;
        int take2 = cardsTaken2;

        CardsList myDeck = new CardsList();
        CardsList hand = new CardsList();
        CardsList discardedPile = new CardsList();

        Cards card1 = new Cards("Blue Eyes White Dragon", 1);
        Cards card2 = new Cards("Pot of greed", 2);
        Cards card3 = new Cards("Card of Destruction", 3);
        Cards card4 = new Cards("Mirror force", 4);
        Cards card5 = new Cards("Trap Hole", 5);
        Cards card6 = new Cards("Dark Magician", 6);
        Cards card7 = new Cards("Bird Face", 7);
        Cards card8 = new Cards("Lord of D.", 8);
        Cards card9 = new Cards("Battle Ox", 9);
        Cards card10 = new Cards("Humpty Grumpty", 10);
        Cards card11 = new Cards("Blue Eyes White Dragon", 11);
        Cards card12 = new Cards("Pot of greed", 12);
        Cards card13 = new Cards("Card of Destruction", 13);
        Cards card14 = new Cards("Mirror force", 14);
        Cards card15 = new Cards("Trap Hole", 15);
        Cards card16 = new Cards("Dark Magician", 16);
        Cards card17 = new Cards("Bird Face", 17);
        Cards card18 = new Cards("Lord of D.", 18);
        Cards card19 = new Cards("Battle Ox", 19);
        Cards card20 = new Cards("Humpty Grumpty", 20);
        Cards card21 = new Cards("Blue Eyes White Dragon", 21);
        Cards card22 = new Cards("Pot of greed", 22);
        Cards card23 = new Cards("Card of Destruction", 23);
        Cards card24 = new Cards("Mirror force", 24);
        Cards card25 = new Cards("Trap Hole", 25);
        Cards card26 = new Cards("Dark Magician", 26);
        Cards card27 = new Cards("Bird Face", 27);
        Cards card28 = new Cards("Lord of D.", 28);
        Cards card29 = new Cards("Battle Ox", 29);
        Cards card30 = new Cards("Humpty Grumpty", 30);

        myDeck.push(card1); myDeck.push(card2);myDeck.push(card3);myDeck.push(card4);myDeck.push(card5);
        myDeck.push(card6);myDeck.push(card7);myDeck.push(card8);myDeck.push(card9);myDeck.push(card10);
        myDeck.push(card11); myDeck.push(card12);myDeck.push(card13);myDeck.push(card14);myDeck.push(card15);
        myDeck.push(card16);myDeck.push(card17);myDeck.push(card18);myDeck.push(card19);myDeck.push(card20);
        myDeck.push(card21); myDeck.push(card22);myDeck.push(card23);myDeck.push(card24);myDeck.push(card25);
        myDeck.push(card26);myDeck.push(card27);myDeck.push(card28);myDeck.push(card29);myDeck.push(card30);

        while(Deck >= 0) {

            Deck = Deck - 5;

            int number = (int) (Math.random() * 3) + 1;
            while (true) {
                if (number == 1)
                    System.out.println("\nyou drew " + take + " cards");
                else if (number == 2)
                    System.out.println("\nyou discared " + discard + " cards");
                else
                    System.out.println("\nyou took cards " + take2 + " from the discarded pile");
                break;

            }


            System.out.println("\nCards currently in your hand:" + cardsTaken);

            System.out.println("Cards in your deck:" + discard);

            System.out.println("Cards in the discarded pile:" + take2 );

        }
    }


}
