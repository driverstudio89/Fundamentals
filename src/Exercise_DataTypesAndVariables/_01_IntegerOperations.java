package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _01_IntegerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int result = (firstNum + secondNum) / thirdNum * fourthNum;

        System.out.println(result);

    }
}
