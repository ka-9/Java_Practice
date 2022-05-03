package Intermediate;
import java.util.Scanner;
public class MinMaxCharachter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String inputStr;
        System.out.println("Enter a string to process: ");
        inputStr = scan.nextLine();
        checkMinMax(inputStr);
    }
    private static void checkMinMax(String inputStr) {
        int occurrences = 0, maxOcc = 0, minOcc = inputStr.length();
        char maxChar = '\0', minChar = '\0';
        for (int idx1 = 0; idx1 < inputStr.length(); idx1++) {
            occurrences = 0;
            for (int idx2 = 0; idx2< inputStr.length(); idx2++) {
                if (inputStr.charAt(idx1) == inputStr.charAt(idx2)) {
                    occurrences++;
                }
            }
            if (occurrences < minOcc) {
                minOcc = occurrences;
                minChar = inputStr.charAt(idx1);
            } else if (occurrences > maxOcc) {
                maxOcc = occurrences;
                maxChar = inputStr.charAt(idx1);
            }
        }
        System.out.println("Character with max number of occurrences: " + maxChar + "\nCharacter with min number of occurrences: " + minChar);
    }
}
