package LabObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstInteger = new BigInteger(scanner.nextLine());
        BigInteger secondInteger = new BigInteger(scanner.nextLine());

        BigInteger sum = firstInteger.add(secondInteger);

        System.out.println(sum);
    }
}
