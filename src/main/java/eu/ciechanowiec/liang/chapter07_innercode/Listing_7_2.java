package eu.ciechanowiec.liang.chapter07_innercode;

import java.util.Random;
import java.util.random.RandomGenerator;

class Listing_7_2 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();

        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = random.nextInt(deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.printf("Card number %d: %s of %s%n", deck[i], rank, suit);
        }
    }
}
