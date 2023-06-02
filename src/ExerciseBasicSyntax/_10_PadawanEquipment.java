package ExerciseBasicSyntax;

import java.util.Scanner;

public class _10_PadawanEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double georgeMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int beltFree = studentsCount / 6;

        lightsaberPrice = lightsaberPrice * Math.ceil(studentsCount * 1.1);
        robePrice = robePrice * studentsCount;
        beltPrice = beltPrice * (studentsCount - beltFree);

        double totalPrice = lightsaberPrice + robePrice + beltPrice;

        if (totalPrice <= georgeMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", (totalPrice - georgeMoney));
        }

    }
}
