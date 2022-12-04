package ExceptionPractice;

public class NumberFormatExt {
	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt("kkkkk");
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Number format Exception");
		}
	}

}
