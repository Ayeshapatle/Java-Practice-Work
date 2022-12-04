package Practice;

import java.io.FileNotFoundException;

public class DemoTest {
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		try {
			d.read();
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			System.out.println("File Not found Exc");
			//e.printStackTrace();
		}
		try {
			d.save();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
