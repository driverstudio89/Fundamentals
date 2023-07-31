package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(?<!\\S)([$%])(?<tag>[A-Z][a-z]{2,})(\\1)(\\:\\s)\\[(?<first>[0-9]+)\\]\\|\\[(?<second>[0-9]+)\\]\\|\\[(?<third>[0-9]+)\\]\\|(?!\\S)";

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String tag = matcher.group("tag");
                int firstNum = Integer.parseInt(matcher.group("first"));
                int secondNum = Integer.parseInt(matcher.group("second"));
                int thirdNum = Integer.parseInt(matcher.group("third"));
                char firstAsChar = (char) firstNum;
                char secondAsChar = (char) secondNum;
                char thirdAsChar = (char) thirdNum;
                System.out.printf("%s: ", tag);
                System.out.print(firstAsChar);
                System.out.print(secondAsChar);
                System.out.print(thirdAsChar);
                System.out.println();
            } else {
                System.out.println("Valid message not found!");
            }

        }


    }
}
