package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.*;

public class Task_4_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("0", "0000");
        map.put("1", "0001");
        map.put("2", "0010");
        map.put("3", "0011");
        map.put("4", "0100");
        map.put("5", "0101");
        map.put("6", "0110");
        map.put("7", "0111");
        map.put("8", "1000");
        map.put("9", "1001");
        map.put("A", "1010");
        map.put("B", "1011");
        map.put("C", "1100");
        map.put("D", "1101");
        map.put("E", "1110");
        map.put("F", "1111");

        System.out.println("Enter a hex digit:");
        String hex = scanner.nextLine().toUpperCase();

        System.out.println(map.get(hex));
    }
}
