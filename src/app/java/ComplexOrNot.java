package app.java;

import java.util.HashSet;
import java.util.Scanner;

class ComplexOrNot {
    public static void main(String[] args) {
        System.out.printf("For your information! The minimum and max limits you can type are as following:\n %d and %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            int counter = 0;
            int secondDivider = number;
            HashSet<Integer> uniques = new HashSet<>();
            uniques.add(1);
            uniques.add(number);

            for (int i = 2; i < secondDivider; i++) {
                counter++;
                // if a % b == 0? then b and c(result of a/b) are divider
                if (number % i == 0) {
                    uniques.add(i);
                    secondDivider = number / i;
                    uniques.add(secondDivider);
                }
            }

            System.out.println("Loop was used " + counter + " times.");
            System.out.println(uniques);
            if (uniques.size() > 2) {
                System.out.println("Complex!");
            } else {
                System.out.println("Simple ehh...");
            }

            number = scanner.nextInt();
    }
}
