package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCap = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command[0].equals("Add")){
                int passengers = Integer.parseInt(command[1]);
                passengersList.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(command[0]);
                for (int i = 0; i < passengersList.size(); i++) {
                    int currentWagon = passengersList.get(i);
                    if (currentWagon + passengersToAdd <= maxCap){
                        passengersList.set(i, currentWagon + passengersToAdd);
                        break;
                    }

                }
            }


            input = scanner.nextLine();
        }
        System.out.println(passengersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
