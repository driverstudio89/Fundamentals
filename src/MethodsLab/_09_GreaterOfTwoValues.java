package MethodsLab;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();
        switch (dataType) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int biggerNumber = getMax(firstNum, secondNum);
                System.out.println(biggerNumber);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char biggerChar = getMax(firstChar, secondChar);
                System.out.println(biggerChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String biggerString = getMax(firstString, secondString);
                System.out.println(biggerString);
                break;
        }

    }
    public static int getMax(int firstNum, int secondNum){
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    public static char getMax(char first, char second){
        if (first > second) {
            return first;
        }
        return  second;
    }
    public static String getMax(String first, String second){
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
