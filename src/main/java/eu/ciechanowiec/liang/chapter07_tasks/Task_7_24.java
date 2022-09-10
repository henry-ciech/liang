package eu.ciechanowiec.liang.chapter07_tasks;

class Task_7_24 {

    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] picks = new int[4];
        int count = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        shuffleCards(deck);

        do {
            pickCards(deck, picks);
            count++;
        } while (!isOneOFEachSuit(picks));

        print(picks);

        System.out.printf("Number of picks: %d", count);
    }

    private static void shuffleCards(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = pickCards(deck);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    private static void pickCards(int[] deck, int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            picks[i] = deck[pickCards(deck)];
        }
    }

    private static int pickCards(int[] deck) {
        return (int)(Math.random() * deck.length);
    }

    private static boolean isOneOFEachSuit(int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (i != j && (picks[i] / 13 == picks[j] / 13)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void print(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int pick : picks) {
            System.out.println(ranks[pick % 13] + " of " + suits[pick / 13]);
        }
    }
}
