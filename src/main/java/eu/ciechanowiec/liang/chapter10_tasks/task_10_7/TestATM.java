package eu.ciechanowiec.liang.chapter10_tasks.task_10_7;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

class TestATM {

    private static int chosenID;

    private static final AtomicBoolean isOn = new AtomicBoolean(false);
    static Account[] ATM = new Account[10];

    public static void main(String[] args) {
        addAccounts();
        choseID();

        isOn.set(true);
        while (isOn.get()) {
            System.out.println();
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
        performOperation(scanner.nextInt());
    }

    static void performOperation(int chosenOperation) {
        Scanner scanner = new Scanner(System.in);
        switch (chosenOperation) {
            case 1 -> System.out.printf("Balance: $%.1f%n", ATM[chosenID].printBalance());
            case 2 -> {
                System.out.println("Enter amount to withdraw:");
                ATM[chosenID].withdraw(scanner.nextDouble());
            }
            case 3 -> {
                System.out.println("Enter amount to add:");
                ATM[chosenID].deposit(scanner.nextDouble());
            }
            case 4 -> choseID();
            case 5 -> {
                System.out.println("Goodbye");
                isOn.set(false);
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
        ATM[0] = new Account();
        ATM[1] = new Account();
        ATM[2] = new Account();
        ATM[3] = new Account();
        ATM[4] = new Account();
        ATM[5] = new Account();
        ATM[6] = new Account();
        ATM[7] = new Account();
        ATM[8] = new Account();
        ATM[9] = new Account();
    }
}
