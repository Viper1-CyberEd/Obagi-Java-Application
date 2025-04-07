public class MethodWithReturnType{
	public static void main(String[] args){
		MethodWithReturnType MWRT = new MethodWithReturnType();
		int result = MWRT.addition(15,30);
		System.out.printf("The Sum Is %d%n",result);
	}
	public int addition(int num1, int num2){
		int sum = num1 + num2;
		
		return sum;
	}
}
