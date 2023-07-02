package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            String item = input.split(" ")[1];
            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    if (shoppingList.contains(item)) {
                    String newItem = input.split(" ")[2];
                    int index = shoppingList.indexOf(item);
                    shoppingList.set(index, newItem);
                }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        String currentItem = item;
                        shoppingList.remove(item);
                        shoppingList.add(currentItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
