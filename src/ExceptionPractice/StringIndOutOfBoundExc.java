package ExceptionPractice;

public class StringIndOutOfBoundExc {
	public static void main(String[] args) {
		try {
			String s = "This is Core Java";
			System.out.println(s.charAt(5));
		} catch (Exception e) {
			System.out.println("String Index Out of bound Exception");
		}
	}

}
