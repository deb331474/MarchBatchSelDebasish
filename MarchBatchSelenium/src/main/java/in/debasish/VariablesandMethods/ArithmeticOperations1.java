package in.debasish.VariablesandMethods;

public class ArithmeticOperations1 {
	
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		
		System.out.println("The resul of Multiplicartion");
		return a*b;
	}
	
	public void division(int a,int b) {
		System.out.println("The Final Result after division is : "+a/b);
	}

	public static void main(String[] args) {

		ArithmeticOperations1 ap=new ArithmeticOperations1();
		int sum1=ap.sum(10, 2);
		int sum2=ap.sum(sum1, 2);
		int mulRes=ap.multiply(sum2, 2);
		ap.division(mulRes, 2);
	}

}
