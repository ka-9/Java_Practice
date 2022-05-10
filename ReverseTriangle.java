public class ReverseTriangle {
	public static void main(String[] args) {
		int idx3 = 1;
		int rows = 4;
		for (int idx4 = 0; idx4 < 4; idx4++) {
			for (int idx1 = 0; idx1 < rows-1; idx1++) {
				System.out.print(" ");
			}
			for (int idx2 = 0; idx2 < idx3; idx2++) {
				System.out.print("*");
			}
			System.out.println();
			rows--;
			idx3++;
		}
	}	
}
