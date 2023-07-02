package MethodsLab;

import java.util.Scanner;

public class _07_RepeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String repeatedString = repeatString(text, n);
        System.out.println(repeatedString);

    }

    public static String repeatString(String text, int n){
        String result = "";
        for (int i = 1; i <= n ; i++) {
            result = result + text;
        }
        return result;
    }
}
