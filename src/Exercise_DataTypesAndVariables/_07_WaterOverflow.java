package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _07_WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int totalWater = 0;

        for (int i = 1; i <= n ; i++) {
            int waterQuantity = Integer.parseInt(scanner.nextLine());
            if (waterQuantity + totalWater > capacity){
                System.out.println("Insufficient capacity!");
                continue;
            }
            totalWater += waterQuantity;

        }
        System.out.println(totalWater);
    }
}
