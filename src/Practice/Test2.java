package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,22,55,44,66,15);
	
	list.stream().forEach(e->System.out.println(e));
	System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));
	System.out.println(list.stream().filter(e->e%2!=0).collect(Collectors.toList()));
	
	System.out.println(list.stream().sorted().collect(Collectors.toList()));
	System.out.println(list.stream().map(e->e*e).collect(Collectors.toList()));
}
}
