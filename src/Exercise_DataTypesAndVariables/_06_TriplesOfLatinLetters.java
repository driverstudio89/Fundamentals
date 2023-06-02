package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _06_TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char firstLetter = 'a'; firstLetter < 'a' + n; firstLetter++) {
            for (char secondLetter = 'a'; secondLetter <'a' + n; secondLetter++) {
                for (char thirdLetter = 'a'; thirdLetter < 'a' + n; thirdLetter++) {

                    System.out.printf("%c%c%c", firstLetter, secondLetter, thirdLetter);
                    System.out.println();
                }
            }
        }
    }
}
