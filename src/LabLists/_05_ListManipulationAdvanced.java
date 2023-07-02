package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            String secondCommand = commandParts[1];

            switch (command){
                case "Contains":
                if (numbersList.contains(Integer.parseInt(secondCommand))){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
                    break;
                case "Print":
                    switch (secondCommand){
                        case "even":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum % 2 == 0){
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum % 2 != 0){
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }

                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNum = numbersList.get(i);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    int thirdCommand = Integer.parseInt(commandParts[2]);
                    switch (secondCommand){
                        case "<":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum < thirdCommand) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum > thirdCommand) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum >= thirdCommand) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "<=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum <= thirdCommand) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }


                    break;

            }
            input = scanner.nextLine();
        }

    }
}
