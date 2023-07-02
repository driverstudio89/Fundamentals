package MethodsLab;

import java.util.Scanner;

public class _04_Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int inputOne = Integer.parseInt(scanner.nextLine());
        int inputTwo = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (command) {
            case "add":
                result = addNum(inputOne, inputTwo);
                break;
            case "multiply":
                result = multiplyNum(inputOne, inputTwo);
                break;
            case "subtract":
                result = subtractNum(inputOne, inputTwo);
                break;
            case "divide":
                result = divideNum(inputOne, inputTwo);
                break;
        }
        System.out.println(result);
    }

    public static int addNum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int multiplyNum(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int subtractNum(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int divideNum(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
