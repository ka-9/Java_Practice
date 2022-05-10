import java.util.Scanner;
public class PigLatinV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr;

        System.out.println("Enter a sentence to translate: ");
        inputStr = scan.nextLine();

        PigLatinTranslator.translate(inputStr);
        scan.close();
    }
}
