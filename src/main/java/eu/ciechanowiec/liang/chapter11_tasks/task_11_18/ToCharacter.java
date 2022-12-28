package eu.ciechanowiec.liang.chapter11_tasks.task_11_18;

import java.util.ArrayList;
import java.util.Scanner;

class ToCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String:");
        String word = scanner.nextLine();
        ArrayList<Character> list = toCharacterArray(word);
        printArray(list);
        System.out.println();
    }

    private static ArrayList<Character> toCharacterArray(String string) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            characters.add(string.charAt(i));
        }

        return characters;
    }

    private static void printArray(ArrayList<?> list) {
        for (Object number : list) {
            System.out.print(number + " ");
        }
    }
}
