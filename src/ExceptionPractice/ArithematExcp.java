package ExceptionPractice;

public class ArithematExcp {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;

			System.out.println(c);

		} catch (Exception e) {
			System.out.println("Number is not divided by zero");

		}

	}

}
