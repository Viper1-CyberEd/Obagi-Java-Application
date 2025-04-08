import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter Of Different Shapes");
		System.out.println("Enter 1 To Calculate Perimeter Of A Square");
		System.out.println("Enter 2 To Calculate Perimeter Of A Rectangle");
		System.out.println("Enter 3 To Calculate Perimeter Of A Circle");
		
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter The Length Of The Square:");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(lengthOfSquare);
				
			}
			break;
			
			case 2:
			{
				System.out.print("Enter The Length Of The Rectangle:");
				int lengthOfRectangle = input.nextInt();
				
				System.out.print("Enter The breadth Of The Rectangle:");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lengthOfRectangle, breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.print("Enter The Radius Of The Circle:");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			
			default:
			System.out.println("Invalid Input");
			
		}
	}
	
	public static void shape(int length){
		
		int perimeterOfSquare = 4 * length;
		System.out.printf("The Perimeter Of Square Is %d%n",perimeterOfSquare);
	}
	
	public static void shape(int length, int breadth){
		int perimeterOfRectangle = 2*(length + breadth);
		
		System.out.printf("The Perimeter Of Rectangle Is %d%n",perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The Perimeter Of Circle Is %f%n",perimeterOfCircle);
    }
	
}
