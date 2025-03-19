public class DataType{
	public static void main (String[] args){
		//Integer type (byte,short,int,long)
		byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantities of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d%n",populationInNigeria);
		
		Long worldPopulation = 8000000000L;
		System.out.printf("The worldPopulation is %d%n",worldPopulation);
		
		//float-point numbers(float,double)
		float weight = 5.6F;
		System.out.printf("The bag of rice was %.1fkg%n",weight);
		
		Double acctBalance = 487575.94747;
		System.out.printf("Your account balance is %c%.2f%n",'$',acctBalance);
		
		//Boolean type(boolean)
		boolean isJavafun = true;
		System.out.printf("Is Java Fun? %b%n",isJavafun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is eddieozubu@gmail.com%n",alpha);
	}
}

		