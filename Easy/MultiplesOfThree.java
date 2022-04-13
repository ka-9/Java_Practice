import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class MultiplesOfThree {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = "";

        System.out.println("Please enter a sequence of numbers: ");
        inputStr = scan.nextLine();

        System.out.println(checkMultiplesOfThree(inputStr));
    }
    
    private static String checkMultiplesOfThree(String inputStr) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputStr);
        int IntegerPlaceHolder;
        String outputStr = "";

        while (stringTokenizer.hasMoreTokens()) {
            IntegerPlaceHolder = Integer.parseInt(stringTokenizer.nextToken());
            if (IntegerPlaceHolder == 0) {
                return outputStr;
            }
            if (IntegerPlaceHolder % 3 == 0) {
                outputStr += IntegerPlaceHolder + " ";
            }
        }

        return outputStr;
    }
}
