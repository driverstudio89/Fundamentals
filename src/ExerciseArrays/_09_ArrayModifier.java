package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNum = numbersArray[index1];
                int secondIndexNum = numbersArray[index2];
                numbersArray[index1] = secondIndexNum;
                numbersArray[index2] = firstIndexNum;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNum = numbersArray[index1];
                int secondIndexNum = numbersArray[index2];
                int product = firstIndexNum * secondIndexNum;
                numbersArray[index1] = product;

            } else if (command.contains("decrease")) {
                for (int i = 0; i < numbersArray.length; i++) {
                    numbersArray[i]--;
                }

            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbersArray).replace("[", " ").replace("]", " "));

    }
}
