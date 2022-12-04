import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	
public static void main(String[] args) {
	
	//List<Integer> arr = Arrays.asList(100,5,7,45,78,90,5);
	
	Set<Integer> l = new TreeSet<>();
	l.add(55);
	l.add(20);
	l.add(7);
	l.add(88);
	l.add(2);
	
	for (Integer inte : l) {
		System.out.println(inte);
		
	}
	
}
}
