import java.util.Scanner;
import java.io.*;
public class EmailExtractor {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("source.txt");
        File outputFile = new File("Emails.txt");
        
        extractEmail(inputFile, outputFile);

    }  
    private static void extractEmail(File inputFile, File outputFile) throws IOException {
        FileWriter fw = new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        Scanner scanS = new Scanner(inputFile);
        String currentStr;
        int count = 0;

        while (scanS.hasNext()) {
            currentStr = scanS.next();
            if (currentStr.indexOf('@') > 0) {
                pw.println(count + " - " + currentStr);
                count++;
            }
        }
        pw.close();
        scanS.close();
    }     
}
