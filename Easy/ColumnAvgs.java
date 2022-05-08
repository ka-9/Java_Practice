import java.util.Scanner;
import java.util.Arrays;
public class ColumnAvgs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++){
            System.out.println("Please fill in the values for the first column: ");
            for (int j = 0; j < 10; j++){
                arr[j][i] = scan.nextInt();
                scan.nextLine(); 
            }
        }
        calculateAvgs(arr);
        scan.close();
    }
    private static void calculateAvgs(int[][] arr) {
        double[] avgs = new double[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sum += arr[j][i];
            }
            avgs[i] = sum / 10.0;
        }
        System.out.println(Arrays.toString(avgs));
    }
}