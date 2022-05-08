import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr;
        System.out.println("Enter a string to process: ");
        inputStr = scanner.nextLine();

        toPhoneKeyPad(inputStr);
    }
    private static void toPhoneKeyPad(String inputStr) {
        String str1 = inputStr.toLowerCase();
        String output = "";
        int currentInt;
        for (int i = 0; i < str1.length(); i++) {
            currentInt = str1.charAt(i) - 'a';
            output += ((currentInt / 3) + 2);
        }
        System.out.println(output);
    }
    
}
