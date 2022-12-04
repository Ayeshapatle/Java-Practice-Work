package SupernThisTask;

public class A {

	public A(int x) {

		this(11.0f);
		System.out.println("A Constructor");
	}

	public A(float f) {
		System.out.println("Float Constructor");
		this.m1("fff");
	}

	public void m1(String s) {
		System.out.println("m1 Method");
	}
}
