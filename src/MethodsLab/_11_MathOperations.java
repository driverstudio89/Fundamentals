package MethodsLab;

import java.util.Scanner;

public class _11_MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (operator){
            case "+":
                result = addNum(firstNum, secondNum);
                break;
            case "-":
                result = subtractNum(firstNum, secondNum);
                break;
            case "*":
                result = multiplyNum(firstNum, secondNum);
                break;
            case "/":
                result = divideNum(firstNum, secondNum);
                break;
        }
        System.out.println(result);
    }
    public static int addNum(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    public static int subtractNum(int firstNum, int secondNum){
        return firstNum - secondNum;
    }
    public static int multiplyNum(int firstNum, int secondNum){
        return firstNum * secondNum;
    }
    public static int divideNum(int firstNum, int secondNum){
        return firstNum / secondNum;
    }
}
