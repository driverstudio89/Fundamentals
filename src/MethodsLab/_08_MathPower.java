package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _08_MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = mathPower(number, power);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double mathPower(double number, double power){
        double result = 1;
        for (double i = 1; i <= power ; i++) {
            result = result * number;
        }
        return result;
    }


}
