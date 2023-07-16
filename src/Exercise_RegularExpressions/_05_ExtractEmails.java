package Exercise_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b(?<user>\\w+[_.-]?\\w+)@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }




    }
}
