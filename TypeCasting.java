public class TypeCasting{
	public static void main (String[] args) {
		//Widening Type Casting
		double weight = 678;
		System.out.printf("Your weight is %f%n",weight);
		
		//Narrowing Type Casting ASCII Code ? = 63
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The ASCII Code for ? is %d%n",asciiCode);
		
		double height = 5.8;
		
		int myHeight = (int)height;
		System.out.printf("My Faculty's Height is %d%n",myHeight);
		
	}
}