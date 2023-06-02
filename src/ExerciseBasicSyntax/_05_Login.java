package ExerciseBasicSyntax;

import java.util.Scanner;

public class _05_Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = "";
        int tryCount = 0;

        for (int position = username.length() - 1; position >= 0; position--){
            char currentSymbol = username.charAt(position);
            pass += currentSymbol;
        }

        String input = scanner.nextLine();

        while (!input.equals(pass)){
            if (tryCount >= 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            tryCount++;

            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();

        }

        if (input.equals(pass)){
            System.out.printf("User %s logged in.", username);
        }


    }
}
