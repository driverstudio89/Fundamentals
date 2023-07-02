package MidExam_18June2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _02_CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            switch (command) {
                case "Include":
                    String coffeeToAdd = input.split(" ")[1];
                    coffeeList.add(coffeeToAdd);
                    break;
                case "Remove":
                    String secondCommand = input.split(" ")[1];
                    int numberCoffeesToRemove = Integer.parseInt(input.split(" ")[2]);
                    if (coffeeList.size() < numberCoffeesToRemove) {
                        continue;
                    }
                    if (secondCommand.equals("first")) {
                        for (int j = 0; j < numberCoffeesToRemove; j++) {
                            coffeeList.remove(0);
                        }
                    } else if (secondCommand.equals("last")) {
                        for (int j = 0; j < numberCoffeesToRemove; j++) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(input.split(" ")[1]);
                    int index2 = Integer.parseInt(input.split(" ")[2]);
                    if (isExistingIndex(index1, coffeeList.size()) && isExistingIndex(index2, coffeeList.size())) {
                        String firstCoffee = coffeeList.get(index1);
                        String secondCoffee = coffeeList.get(index2);
                        coffeeList.set(index1, secondCoffee);
                        coffeeList.set(index2, firstCoffee);
                    }
                    break;

                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }

        }
        System.out.println("Coffees:");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isExistingIndex(int index, int listSize) {
        return (index >= 0 && index < listSize);
    }
}
