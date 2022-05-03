package Incomplete;

public class Hourglass {
    public static void main(String[] args){
        final int COLS = 9;
        final int ROWS = 4;
        for (int idx1 = 0; idx1 < ROWS; idx1++) {
            for (int idx3 = 0; idx3 < idx1; idx3++) {
                System.out.print(" ");
            }
            for (int idx2 = COLS; idx2 > idx1; idx2--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
