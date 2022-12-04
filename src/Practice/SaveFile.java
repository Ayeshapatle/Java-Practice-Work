package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveFile {

	public static void main(String[] args) {

//		File f1 = new File("E:\\AA.txt");
//		try {
//			f1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		try {
//			FileWriter fw = new FileWriter("E:\\AA.txt");
//			fw.write("Hello \n Bye");
//			fw.close();
//		} catch (IOException e) {
//			System.out.println("Unable to write");
//			e.printStackTrace();
//		}

//		File fs = new File("E:\\AA.txt");
//		
//		try {
//			Scanner sc = new Scanner(fs);
//			while(sc.hasNextLine()) {
//				String s = sc.next();
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		File fs = new File("E:\\this.txt");
		if (fs.delete()) {
			System.out.println("Successfully deleted file: "+ fs.getName());
		} else {
			System.out.println("Unable to delete");
		}

	}

}
