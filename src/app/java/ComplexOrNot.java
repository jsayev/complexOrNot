package app.java;

import java.util.HashSet;
import java.util.Scanner;

class ComplexOrNot {
    public static void main(String[] args) {
        System.out.printf("For your information! The minimum and max limits you can type are as following:\n %d and %d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            int counter = 0;
            int limit = number;
            HashSet<Integer> uniques = new HashSet<>();

            for (int i = 1; i < limit; i++) {
                counter++;
                if (number % i == 0) {
                    uniques.add(i);
                    if (number / i < limit) {
                        uniques.add(number / i);
                    }
                    limit = number / i;
                }
            }
            uniques.add(number);

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
}
