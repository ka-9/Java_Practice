import java.util.Scanner;
import java.util.StringTokenizer;
public class DiagonalPrinting {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = "";

        System.out.println("Enter a string to process: ");
        inputStr = scan.nextLine();

        Scanner scanL = new Scanner(inputStr);

        while (scanL.hasNext()) {
            String currentToken = scanL.next();
            String padding = "";
            for (int counter1 = 0; counter1 < currentToken.length(); counter1++) {
                System.out.println(padding + currentToken.charAt(counter1));
                padding += " ";
            }
        }
      

    }
    
}
