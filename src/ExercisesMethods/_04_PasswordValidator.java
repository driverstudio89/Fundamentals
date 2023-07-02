package ExercisesMethods;

import java.util.Scanner;
public class _04_PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        printPassIsValid(password);
    }
    public static void printPassIsValid(String pass) {
        if (isValidLength(pass) && isOnlyLettersAndDigits(pass) && isHavingTwoDigits(pass)){
            System.out.println("Password is valid");
        } else {
            if (!isValidLength(pass)){
                System.out.println("Password must be between 6 and 10 characters");
            } if (!isOnlyLettersAndDigits(pass)){
                System.out.println("Password must consist only of letters and digits");
            }if (!isHavingTwoDigits(pass)){
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean isValidLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean isOnlyLettersAndDigits(String pass) {
        boolean isValid = true;
        char[] charArr = pass.toCharArray();
        for (char i = 0; i < pass.length(); i++) {
            if ((charArr[i] >= 48 && charArr[i] <= 57) || (charArr[i] >= 65 && charArr[i] <= 90) || (charArr[i] >= 97 && charArr[i] <= 122)){
                isValid = true;
            }else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean isHavingTwoDigits(String pass) {
        char[] charArr = pass.toCharArray();
        boolean isValid = false;
        int digitCounter = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (charArr[i] >= 48 && charArr[i] <= 57) {
                digitCounter++;
                if (digitCounter >= 2) {
                    isValid = true;
                    break;
                }
            }
        }
        return isValid;
    }
}
