import java.util.Scanner;
import java.io.*;
public class IntReadWrite { 
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("Ints1.txt"));
        FileWriter fw = new FileWriter(new File("Ints2.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outToFile = new PrintWriter(bw);

        while (scan.hasNext()) {
            outToFile.println(scan.nextInt() + 1);
        }
        outToFile.close();
    }
    
}
