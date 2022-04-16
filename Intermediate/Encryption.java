import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr, encryptedStr, decryptedStr;
        System.out.println("Enter S: ");
        inputStr = scan.nextLine();

        encryptedStr = encrypt(inputStr);
        //decryptedStr = decrypt(encryptedStr);

        System.out.println("Encrypted message: " + encryptedStr);
        //System.out.println("Decrypted message: " + decryptedStr);
    }
    // Exam is fun becomes 5 4 4 7 Easfnxmiu
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
}