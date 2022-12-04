package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo1 {

	public void read() throws FileNotFoundException {
          
		FileInputStream fis = new FileInputStream("E:\\xyz.txt");
	}
	
	public void save() throws FileNotFoundException {
		
		FileOutputStream fiso = new FileOutputStream("E:\\AA.txt");
	}
}
