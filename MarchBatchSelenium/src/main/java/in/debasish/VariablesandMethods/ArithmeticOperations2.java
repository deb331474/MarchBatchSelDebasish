package in.debasish.VariablesandMethods;

public class ArithmeticOperations2 {
	
	
	public int sum(int a,int b) {
		System.out.println("sdfsdsadc");
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		System.out.println("sdfsdsadc");
		return a*b;
		
	}
	
	public void division(int a,int b) {
		System.out.println("The Final Result after division is : "+a/b);
	}

	public static void main(String[] args) {

		ArithmeticOperations2 ap=new ArithmeticOperations2();
		int multi1=ap.multiply(10, 2);
		int sum=ap.sum(multi1, 2);
		int subtrc=ap.subtract(sum, 2);
		int multi2=ap.multiply(subtrc, 2);
	    ap.division(multi2, 2);
		
	}

}
