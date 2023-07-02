package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            switch (command) {
                case "Add":
                    numbersList.add(Integer.parseInt(commandParts[1]));
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(Integer.parseInt(commandParts[1])));
                    break;
                case "RemoveAt":
                    numbersList.remove(Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(commandParts[2]), Integer.parseInt(commandParts[1]));
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
