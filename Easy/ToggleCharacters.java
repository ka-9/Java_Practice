import java.util.Scanner;
public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Enter a value to process: ");
        str = scan.nextLine();
        
        String output = "";
        for(int idx = 0; idx < str.length(); idx++) {
            char currentChar = str.charAt(idx);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + 32);
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar = (char) (currentChar - 32);
            }
            output += currentChar;
        }
        System.out.println(output);
    }
}
