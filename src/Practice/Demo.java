package Practice;

public class Demo {
	
	public void m1(Object o) {
		System.out.println("M1 of Object Class");
		
	}
	public void m1(String s) {
		System.out.println("M1 of String Class");
	}
	
	public static void main() {
		System.out.println("Black main Method");
		Demo d = new Demo();
		d.m1(null);
		
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1(null);
		System.out.println("Child Class Printed");
	}

}
