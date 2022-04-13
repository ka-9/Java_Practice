public class TriangleV2 {
    public static void main(String[] args) {
        final int ROWS = 4;
        final int COLS = 5;
        for (int idx1 = ROWS; idx1 > 0; idx1--) {
            for (int idx2 = 0; idx2 < idx1+1; idx2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*");
        for (int idx3 = 0; idx3 < ROWS; idx3++) {
            for (int idx4 = 1; idx4 < idx3+3; idx4++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
