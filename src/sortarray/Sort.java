package sortarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//prime number(2,3,5,7) //1221
public class Sort {

	public static void main(String[] args) {

		int num = 1221;
		int orig = num;
		int rev  = 0;
		int rem;
		
		while(orig!=0) {
			
			rem = orig%10;
			rev = rev*10 + rem;
			orig = orig/10;
		}
		if(num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not p");
		}
	
	}

}
