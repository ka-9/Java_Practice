import java.util.Random;
public class discrete {
	public static void main (String[] args) {
	Random rnd = new Random();	
	int x = (int) (rnd.nextFloat()*6 + 1 );
	System.out.println (x);
	}
}