import java.util.Scanner;
import java.util.Random;
public class RandomWordGenerator {
	public static void main(String[] args) {
		Random rnd = new Random();
		String S;
		String S1 = "";

		S = "abercd";
		int idx1 = rnd.nextInt(S.length());

		S1 += S.charAt(idx1);
		S = (S.substring(0,idx1) + S.substring(idx1 + 1));

		int idx2 = rnd.nextInt(S.length());

		S1 += S.charAt(idx2);
		S = (S.substring(0,idx2) + S.substring(idx2 + 1));

		int idx3 = rnd.nextInt(S.length());

		S1 += S.charAt(idx3);
		S = (S.substring(0,idx3) + S.substring(idx3 + 1));

		int idx4 = rnd.nextInt(S.length());

		S1 += S.charAt(idx4);
		S = (S.substring(0,idx4) + S.substring(idx4 + 1));

		System.out.println(S1);



	}
}