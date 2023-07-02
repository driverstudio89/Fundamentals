package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_3_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houseList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int currentIndex = 0;

        while (!input.equals("Love!")) {
            int jumpLength = Integer.parseInt(input.split(" ")[1]);
            currentIndex += jumpLength;
            if (currentIndex >= houseList.size()){
                currentIndex = 0;
            }
            int currentHearts = houseList.get(currentIndex);
            if (currentHearts == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            } else {
                houseList.set(currentIndex, currentHearts -= 2);
                if (currentHearts == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            }

            input = scanner.nextLine();
        }
        int housCount = 0;
        System.out.println("Cupid's last position was " + currentIndex + ".");
        boolean isValentine = true;
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i) != 0){
                isValentine = false;
                housCount++;
            }
        }
        if (isValentine){
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", housCount);
        }
    }
}
