package Practice;

public class X {
	
	int i;
	public X(int i) {     //27 
		System.out.println(i);
		this.i = i--;    //27  
	  System.out.println(i); //26	
	}

}
