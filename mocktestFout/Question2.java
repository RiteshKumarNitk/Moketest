package mocktestFout;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number for the Fibonacci series: ");
        int maxNumber = scanner.nextInt();
        int previousNumber = 0;
        int currentNumber = 1;
        System.out.println("Fibonacci series up to " + maxNumber + ":");
        System.out.print(previousNumber + " ");

        for (int i = 1; currentNumber <= maxNumber; i++) {
            System.out.print(currentNumber + " ");

            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        scanner.close();
    }
}

