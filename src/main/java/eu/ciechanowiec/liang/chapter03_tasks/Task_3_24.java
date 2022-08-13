package eu.ciechanowiec.liang.chapter03_tasks;

class Task_3_24 {

    public static void main(String[] args) {
        int rank = (int) (Math.random() * 14);
        int suit = (int) (Math.random() * 4);

        switch (rank) {
            case 0 -> {
                System.out.print("The card you picked is Ace");
            }
            case 1 -> {
                System.out.print("The card you picked is 1");
            }
            case 2 -> {
                System.out.print("The card you picked is 2");
            }
            case 3 -> {
                System.out.print("The card you picked is 3");
            }
            case 4 -> {
                System.out.print("The card you picked is 4");
            }
            case 5 -> {
                System.out.print("The card you picked is 5");
            }
            case 6 -> {
                System.out.print("The card you picked is 6");
            }
            case 7 -> {
                System.out.print("The card you picked is 7");
            }
            case 8 -> {
                System.out.print("The card you picked is 8");
            }
            case 9 -> {
                System.out.print("The card you picked is 9");
            }
            case 10 -> {
                System.out.print("The card you picked is 10");
            }
            case 11 -> {
                System.out.print("The card you picked is Jack");
            }
            case 12 -> {
                System.out.print("The card you picked is Queen");
            }
            case 13 -> {
                System.out.print("The card you picked is King");
            }
        }
        switch (suit) {
            case 0 -> {
                System.out.println(" of Clubs");
            }
            case 1 -> {
                System.out.println(" of Diamonds");
            }
            case 2 -> {
                System.out.println(" of Hearts");
            }
            case 3 -> {
                System.out.println(" of Spades");
            }
        }
    }
}
