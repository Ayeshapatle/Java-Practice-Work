
public class Narrow1 {

	public void m1(Object o) {
		System.out.println("Object Method");
		
	}
	public void m1(Narrow1 m) {
		System.out.println("String Method");
		
	}
	public static void main(String[] args) {
		
		Narrow1 n = new Narrow1();
	       n.m1((Object )n);
		
	}
}
