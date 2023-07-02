package _05_VehicleCatalogue;

public class Vehicle {

    String type;
    String model;
    String color;
    int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        String typeVehicle = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVehicle + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsepower;
    }
}
