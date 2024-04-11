package in.debasish.VariablesandMethods;

class Student{
	int rollNo;
	int age;
	
	public Student(int rollNo,int age) {

		this.rollNo=rollNo;
		this.age=age;
	}
	
	void display1() {
		System.out.println("Welcome all of you");
	}
	
	void display2() {
		System.out.println("Automation is very easy");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + "]";
	}
	
}
public class SampleClass {

	public static void main(String[] args) {

		Student st=new Student(12, 30);
		System.out.println(st);
		st.display1();
		st.display2();
		
	}

}
