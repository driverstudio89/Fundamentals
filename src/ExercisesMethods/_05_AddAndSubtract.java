package ExercisesMethods;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = subtractNumbers(addNumbers(firstNumber, secondNumber), thirdNumber);
        System.out.println(result);
    }

    public static int addNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtractNumbers(int n1, int n2) {
        return n1 - n2;
    }
}
