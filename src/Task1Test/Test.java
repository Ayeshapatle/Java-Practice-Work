package Task1Test;

public class Test {

	public static void main(String[] args) {

		A a1 = new A();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
		System.out.println(a1.b);

		A a2 = new B();
		a2.m1();
		a2.m2();
		System.out.println(a2.a);
		System.out.println(a2.b);

		A a3 = new C();
		a3.m1();
		a3.m2();
		System.out.println(a3.a);
		System.out.println(a3.b);

		A a4 = new D();
		a4.m1();
		a4.m2();
		System.out.println(a4.a);
		System.out.println(a4.b);

		A a5 = new E();
		a5.m1();
		a5.m2();
		System.out.println(a5.a);
		System.out.println(a5.b);

		A a6 = new F();
		a6.m1();
		a6.m2();
		System.out.println(a6.a);
		System.out.println(a6.b);

		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println(b1.d);
		System.out.println(b1.a);
		System.out.println(b1.b);

		B b2 = new C();
		b2.m1();
		b2.m2();
		b2.m3();
		System.out.println(b2.a);
		System.out.println(b2.b);
		System.out.println(b2.d);

		B b3 = new E();
		b3.m1();
		b3.m2();
		b3.m3();
		System.out.println(b3.a);
		System.out.println(b3.b);
		System.out.println(b3.d);

		B b4 = new D();
		b4.m1();
		b4.m2();
		b4.m3();
		System.out.println(b4.a);
		System.out.println(b4.b);
		// System.out.println(b4.c);
		System.out.println(b4.d);

		B b5 = new F();
		b5.m1();
		b5.m2();
		b5.m3();
		System.out.println(b5.a);
		System.out.println(b5.b);
		System.out.println(b5.d);

		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m5();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.d);

		C c2 = new E();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m5();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.d);

		E e1 = new E();
		e1.m1();
		e1.m2();
		e1.m3();
		e1.m5();
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.d);

		D d1 = new D();
		d1.m1();
		d1.m2();
		d1.m3();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);

		D d2 = new F();
		d2.m1();
		d2.m2();
		d2.m3();
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.c);
		System.out.println(d2.d);

		F f1 = new F();
		f1.m1();
		f1.m2();
		f1.m3();
		System.out.println(f1.a);
		System.out.println(f1.b);
		System.out.println(f1.c);
		System.out.println(f1.d);

	}

}
