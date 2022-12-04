package ExceptionPractice;

public class ArrIndexoutOfBoundExc {

	public static void main(String[] args) {

		try {
			//int a[] = new int[5];
			//System.out.println(a[6]);
			
			int b[] = {1,2,5,4,6};
			System.out.println(b[10]);
		} catch (Exception e) {
			System.out.println("Array Index Out of Bound Exception");
		}
	}
}
