import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n",option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The Random Number Is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(10) + 1;
		System.out.printf("The Random Number Is %d%n",integerWithBound);
		
		long timeStamp = random.nextLong();
		System.out.printf("The Time Stamp Is %d%n",timeStamp);
		
		float scoreBoard = random.nextFloat();
		System.out.printf("The Random Number Is %.2f%n",scoreBoard);
		
		double winTeam = random.nextDouble();
		System.out.printf("The Number Is %.2f%n",winTeam);
		
		
	}
}
