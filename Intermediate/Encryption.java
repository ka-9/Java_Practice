import java.util.Scanner;
public class Encryption {
    private static int wsCount, evenCount, oddCount;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr, encryptedStr, decryptedStr;
        System.out.println("Enetr S: ");
        inputStr = scan.nextLine();

        encryptedStr = encrypt(inputStr);
        //decryptedStr = decrypt(encryptedStr);

        System.out.println("Encrypted message: " + encryptedStr);
        //System.out.println("Decrypted message: " + decryptedStr);
    }

    // Exam is fun becomes 5 4 4 7 Easfnxmiu
    private static String encrypt(String inputStr) {
        String output;
        output = indexCount(inputStr); //+ " " + encryptEven(inputStr) + encryptOdd(inputStr);
        return output;
    }
}