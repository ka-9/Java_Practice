package Incomplete;
import java.util.Scanner;
//import java.util.ArrayList;
public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr, encryptedStr;
        //String decryptedStr;
        System.out.println("Enter S: ");
        inputStr = scan.nextLine();

        encryptedStr = encrypt(inputStr);
        //bug decryptedStr = decrypt(encryptedStr);

        System.out.println("Encrypted message: " + encryptedStr);
        //System.out.println("Decrypted message: " + decryptedStr);
        scan.close();
    }
    //Encryption
    //Exam is fun becomes 5 4 4 7 Easfnxmiu
    private static String encrypt(String inputStr) {
        String output;
        String evenChars = evenChars(inputStr);
        String oddChars = oddChars(inputStr);
        output = evenChars.length() + " " + oddChars.length() + " " + wsIndex(inputStr) + evenChars + oddChars;
        return output;
    }
    private static String evenChars(String inputStr) {
        String evenChars = "";
        for (int idx = 0; idx < inputStr.length(); idx = idx + 2) {
            if (inputStr.charAt(idx) == ' ') {
                continue;
            }
            evenChars += inputStr.charAt(idx);
        }
        return evenChars;
    }
    private static String oddChars(String inputStr) {
        String oddChars = "";
        for (int idx = 1; idx < inputStr.length(); idx = idx + 2) {
            if (inputStr.charAt(idx) == ' ') {
                continue;
            }
            oddChars += inputStr.charAt(idx);
        }
        return oddChars;
    }
    private static String wsIndex(String inputStr) {
        String wsIndex = "";
        for (int idx = 0; idx < inputStr.length(); idx++) {
            if (inputStr.charAt(idx) == ' ') {
                wsIndex += idx + " ";
            }
        }
        return wsIndex;
    }
    //TODO: Continue the decryption process
    /* Decryption
    private static String decrypt(String inputStr) {
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        Scanner scanS = new Scanner(inputStr);
        while(scanS.hasNextInt()) {
            spaceIndexes.add(scanS.nextInt());
        }
        String encryptedStr = scanS.next();
        String decryptedStr = "";
        String evenChars = encryptedStr.substring(0, spaceIndexes.get(0));
        String oddChars = encryptedStr.substring(spaceIndexes.get(0));
        int totalNbOfChars = evenChars.length() + oddChars.length() + spaceIndexes.size() -2;

        scanS.close();
        return decryptedStr;
    } */
}