package ThrowKeywordPract;

import java.util.Scanner;

public class Test {
	
	public void display() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		
		try {
			if(age<18) {
				throw new AgeInvalid("You are not eligible for Voting");
			}
			else {
				System.out.println("You are eligible for Voting");
			}
		} catch (AgeInvalid e) {
			e.printStackTrace();
		}
		System.out.println("Exit");
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
	
}
