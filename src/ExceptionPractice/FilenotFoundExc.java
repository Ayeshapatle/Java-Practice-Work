package ExceptionPractice;

import java.io.File;
import java.io.FileReader;

public class FilenotFoundExc {
	public static void main(String[] args) {

		File f = new File("E://abc.txt");
		try {
			FileReader fr = new FileReader(f);
			System.out.println("File Found in E drive");
		} catch (Exception e) {
			System.out.println("File not Found in E drive");
		}
	}

}
