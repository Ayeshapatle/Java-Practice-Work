package Task11;

public class Test {
	public static void main(String[] args) {

		A a = new A(1, "abc");
		System.out.println(a.toString());
		
		B b = new B(22222, a);
		System.out.println(b.toString());

	}

}
