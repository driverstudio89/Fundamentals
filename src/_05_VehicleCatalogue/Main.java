package _05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }
        String vehicleModel = scanner.nextLine();

        while (!vehicleModel.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if (vehicleModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle.toString());
                }
            }
            vehicleModel = scanner.nextLine();
        }
        int carCount = 0;
        int carHorseSum = 0;
        int truckCount = 0;
        int truckHorseSum = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                carCount++;
                carHorseSum += vehicle.getHorsepower();
            } else if (vehicle.getType().equals("truck")) {
                truckCount++;
                truckHorseSum += vehicle.getHorsepower();
            }
        }
        double carAvgHorsePower = carHorseSum * 1.0 / carCount;
        double truckAvgHorsePower = truckHorseSum * 1.0 / truckCount;
        if (carCount == 0) {
            carAvgHorsePower =0;
        }
        if (truckCount == 0) {
            truckAvgHorsePower = 0;
        }

            System.out.printf("Cars have average horsepower of: %.2f.%n", carAvgHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", truckAvgHorsePower);
    }
}
