import java.util.Scanner;

public class SentinelLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double average ; 
		long product = 1;
		int counter = 0;
		
		System.out.println("Enter -1 to mark end of input");
		while(true){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
			}
			counter++;
			sum += num;
			product *= num;
		}
		average = (double)sum/counter;
		
		System.out.printf("The Sum Is %d%n",sum);
		System.out.printf("The Average Is %.2f%n",average);
		System.out.printf("The Product Is %d%n",product);
	}
}
