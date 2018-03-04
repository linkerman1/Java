
public class ifSample {
	public static void main (String args []) {
		int x,y;
		x=10;
		y=20;
		
		if (x<y) System.out.println("x jest mniejsze od y");
		
		x = x*2;
		if (x==y) System.out.println("teraz x jest rowne y");
		x = x*2;
		if(x>y) System.out.println("teraz x jest wieksze od y");
		
		if(x==y)  System.out.println("tego nie zoabaczysz");
		
	}
}
