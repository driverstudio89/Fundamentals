package ExercisesMethods;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);


    }
    public static void printSmallestNumber(int num1, int num2, int num3){
        int smallestNumber = Integer.MIN_VALUE;
        if (num1 <= num2 && num1 <= num3 ){
            smallestNumber = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallestNumber = num2;
        }else {
            smallestNumber = num3;
        }
        System.out.println(smallestNumber);
    }
}
