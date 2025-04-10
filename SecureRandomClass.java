import java.security.SecureRandom;

public class SecureRandomClass{
	public static void main(String[] args){
		SecureRandom securerandom = new SecureRandom();
		
		boolean option = securerandom.nextBoolean();
		System.out.printf("Do you love java %b%n",option);
		
		int integer = securerandom.nextInt();
		System.out.printf("The generated integer is %d%n",integer);
		
		int integerwithbound = securerandom.nextInt(80000);
		System.out.printf("The generated integer is %d%n",integerwithbound);
		
		long Number = securerandom.nextLong();
		System.out.printf("The generated integer is %d%n",Number);
		
		long Number2 = securerandom.nextLong(900_000_000_000_000L);
		System.out.printf("The generated integer is %d%n",Number2);
	}
}
