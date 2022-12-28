package eu.ciechanowiec.liang.chapter11_tasks.task_11_10;

import java.util.Scanner;

class MyStack2Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack2 myStack2 = new MyStack2();

        System.out.println("Enter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            myStack2.push(scanner.nextLine());
        }

        System.out.println();

        myStack2.reverseList();
    }
}
