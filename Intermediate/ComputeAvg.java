import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class ComputeAvg {
    public static void main(String[] args) throws IOException {
        File f = new File ("GradesFile.txt");
        String str = "";
        int sum = 0, count = 0;
        Scanner scan = new Scanner(f);
        Scanner scanS = new Scanner(str);
        scanS.useDelimiter(":");
        while (scan.hasNextLine()) {
            str = scan.nextLine();
            scanS.next();
            count++;
            sum += scanS.nextInt();
        }
        double avg = sum / (double) count;
        System.out.println(avg);
    }
}
