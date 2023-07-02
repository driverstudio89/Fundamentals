package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command[0].equals("Delete")){
                int numbersToRemove = Integer.parseInt(command[1]);
                numbersList.removeAll(Arrays.asList(numbersToRemove));
            } else if (command[0].equals("Insert")) {
                numbersList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
