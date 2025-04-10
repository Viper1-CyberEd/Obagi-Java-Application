// Write To Generate A Number Based On The Input Of A User. Upper Limit Of The Number Should Be Inclusive.

import java.util.Scanner;
import java.security.SecureRandom;

public class GenerateNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		SecureRandom secureRandom = new SecureRandom();
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		if (num < 0){
			System.out.println("Upper Limit Cannot Be Negative. ");
			return;	
		}
		else{
			long number = secureRandom.nextLong(num) + 1;
			System.out.println("The Lower Limit Is 0");
			System.out.println("The Upper Limit Is "+num +1);
			
			System.out.printf("Generated Random Number Is %d%n",num);
		}
	}
}
