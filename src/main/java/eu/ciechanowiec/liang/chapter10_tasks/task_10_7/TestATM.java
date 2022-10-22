package eu.ciechanowiec.liang.chapter10_tasks.task_10_7;

import java.util.Scanner;

class TestATM {

    private static int chosenID;
    static ATM[] accounts = new ATM[10];

    public static void main(String[] args) {
        addAccounts();
        choseID();
        while (true) {
            System.out.println( );
            printMainMenu();
        }
    }

    static void printMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Main menu
                1: check balance
                2: withdraw
                3: deposit
                4: chose another ID
                5: exit
                Enter a choice:
                """);
        operation(scanner.nextInt());
    }

    static void operation(int chosenOperation) {
        Scanner scanner = new Scanner(System.in);
        switch (chosenOperation) {
            case 1 -> System.out.printf("Balance: $%.1f%n", accounts[chosenID].printBalance());
            case 2 -> {
                System.out.println("Enter amount to withdraw:");
                accounts[chosenID].withdraw(scanner.nextDouble());
            }
            case 3 -> {
                System.out.println("Enter amount to add:");
                accounts[chosenID].deposit(scanner.nextDouble());
            }
            case 4 -> choseID();
            case 5 -> {
                System.out.println("Goodbye");
                System.exit(0);
            }
            default -> System.out.println("Wrong input");
        }
    }

    static void choseID() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter id:");
            int id = scanner.nextInt();
            if (id > 9 || id < 0) {
                System.out.println("Invalid input");
            } else {
                chosenID = id;
                break;
            }
        }
    }

    static void addAccounts() {
        accounts[0] = new ATM();
        accounts[1] = new ATM();
        accounts[2] = new ATM();
        accounts[3] = new ATM();
        accounts[4] = new ATM();
        accounts[5] = new ATM();
        accounts[6] = new ATM();
        accounts[7] = new ATM();
        accounts[8] = new ATM();
        accounts[9] = new ATM();
    }
}
