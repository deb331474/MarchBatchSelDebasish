package in.debasish.VariablesandMethods;

public class ConstructorChaning {

	int x1, x2, x3, x4;

	public ConstructorChaning() {

		this(12, 22, 32);
		System.out.println("Default constructor");
	}

	public ConstructorChaning(int a) {

		this(12, 23, 1, 8);
		x1 = a;
		System.out.println("One parameterized constructor");
	}

	public ConstructorChaning(int a, int b) {
		this(12);
		x1 = a;
		x2 = b;
		System.out.println("Two parameterized constructor");
	}

	public ConstructorChaning(int a, int b, int c) {

		x1 = a;
		x2 = b;
		x3 = c;
		System.out.println("Three parameterized constructor");
	}

	public ConstructorChaning(int a, int b, int c, int d) {

		this();
		x1 = a;
		x2 = b;
		x3 = c;
		x4 = d;
		System.out.println("Four parameterized constructor");
	}

	public static void main(String[] args) {

		ConstructorChaning obj = new ConstructorChaning(12, 32);

	}

}
