package CustomExcep;

import java.util.Scanner;

public class Scanner1 {

	public void div(int a, int b) throws CustExc{
		if(b==0) {
			throw new CustExc("Input value of B is zero");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner1 s1 = new Scanner1();
		System.out.println("Enter the Value of A");
		int a = sc.nextInt();
		System.out.println("Enter the value of B");
		int b = sc.nextInt();
		
		try {
			s1.div(a,b);
		} catch (CustExc e) {
			e.printStackTrace();
		}
		
	}
}
