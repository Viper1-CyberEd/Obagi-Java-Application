import java.util.Scanner;

public class NumbersCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the 6th to 8th numbers (indices 5 to 7)
        int sum6to8 = numbers[5] + numbers[6] + numbers[7];

        // Calculate the sum of the 4th to 9th numbers (indices 3 to 8)
        int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8];

        // Compute the result
        int result = sum4to9 - sum6to8;

        // Display the calculation in code form
        System.out.println("(" + sum4to9 + ") - (" + sum6to8 + ") = " + result);

        scanner.close();
    }
}
