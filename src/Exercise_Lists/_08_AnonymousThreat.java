package Exercise_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class _08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandParts = (command.split(" "));
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                String newText = "";

                startIndex = Math.max(startIndex, 0);
                endIndex = Math.min(endIndex, inputList.size() - 1);

                for (int i = startIndex; i <= endIndex; i++) {
                    String currentText = inputList.get(startIndex);
                    newText += currentText;
                    inputList.remove(startIndex);
                }
                inputList.add(startIndex, newText);

            } else if (command.contains("divide")) {
                int index = Integer.parseInt(commandParts[1]);
                int partitions = Integer.parseInt(commandParts[2]);

                String currentText = inputList.get(index);
                inputList.remove(index);

                int divisibleParts = currentText.length() / partitions;

                int startIndex = 0;
                for (int i = 1; i < partitions; i++) {
                    String textPerPart = currentText.substring(startIndex, startIndex + divisibleParts);
                    inputList.add(index, textPerPart);
                    index++;
                    startIndex += divisibleParts;
                }
                String textLastPart = currentText.substring(startIndex, currentText.length());
                inputList.add(index, textLastPart);


            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
