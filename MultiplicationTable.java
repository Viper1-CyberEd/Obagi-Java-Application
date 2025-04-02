import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter the range: ");
        int stopValue = input.nextInt();

        int i = 1; // Start from 1

        while (i <= stopValue) {
            int product = num * i; // Multiply num by i
            System.out.printf("%d x %d = %d%n", num, i, product);
            i++; // Increment i
        }
    }
}
