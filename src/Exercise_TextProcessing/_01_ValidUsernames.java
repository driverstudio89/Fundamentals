package Exercise_TextProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernameArr = scanner.nextLine().split(", ");

        for (String username : usernameArr) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }

    }
    private static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char currentChar : username.toCharArray()) {
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '-' && currentChar != '_') {
                return false;
            }
        }
        return true;
    }
}
