package Practice;

public class Y extends X {

	public Y(int i) {

		super(++i);         //26    
		System.out.println(i);
	}

	public static void main(String[] args) {

		Y y = new Y(26);

	}

}
