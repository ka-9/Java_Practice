import java.util.Scanner;
public class ReverseSentence {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String inputStr;
        System.out.println("Enter a sentence to process: ");
        inputStr = scan.nextLine();
        String outputStr = "";
        Scanner scanS = new Scanner(inputStr);
        while (scanS.hasNext()) {
            outputStr = scanS.next() + " " + outputStr;
        }
        System.out.println(outputStr);
        scanS.close();
        scan.close();
    }
}
