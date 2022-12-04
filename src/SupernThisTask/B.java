package SupernThisTask;

public class B extends A {

	public B(String b) {
		super(10);
		this.m2(55);
		System.out.println("B Constructor of String");
	}

	public B(long c) {
		this("aaa");
		System.out.println("B Constructor of Long");
	}

	public void m2(int a) {

		System.out.println("m2 Method");

	}

}
