package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String operation = scanner.nextLine();

        while (!operation.equals("End")) {
            String[] commandParts = operation.split(" ");
            if (operation.contains("Add")) {
                numbersList.add(Integer.parseInt(commandParts[1]));
            } else if (operation.contains("Insert")) {
                int index = Integer.parseInt(commandParts[2]);
                int element = Integer.parseInt(commandParts[1]);
                if (isIndexValid((index), numbersList.size())) {
                    numbersList.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (operation.contains("Remove")) {
                int index = Integer.parseInt(commandParts[1]);
                if (isIndexValid((index), numbersList.size())) {
                    numbersList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (operation.contains("Shift left")) {
                int count = Integer.parseInt(commandParts[2]);

                    for (int i = 0; i < count; i++) {
                        int firstNum = numbersList.get(0);
                        numbersList.remove(0);
                        numbersList.add(firstNum);
                    }
            } else if (operation.contains("Shift right")){
                int count = Integer.parseInt(commandParts[2]);

                for (int i = 0; i < count; i++) {
                    int lastNum = numbersList.get(numbersList.size()-1);
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0, lastNum);
                }
            }

            operation = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isIndexValid(int index, int arraySize) {
        return index >= 0 && index < arraySize;
    }
}
