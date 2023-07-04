package mocktestFout;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers (enter a negative number to finish): ");

        int sum = 0;
        int count = 0;
        int number;

        do {
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
                count++;
            }
        } while (number >= 0);

        double average = (double) sum / count;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}

