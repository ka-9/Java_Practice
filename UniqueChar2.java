import java.util.Scanner;
public class UniqueChar2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String inputStr = "";
        int counter = 0;

        System.out.println("Enter a string: ");
        inputStr = scan.nextLine();

        for (int idx = 0; idx < inputStr.length(); idx++) {
            if (inputStr.indexOf(inputStr.charAt(idx)) == inputStr.lastIndexOf(inputStr.charAt(idx))) {
                counter++;
            }
        }
        if (inputStr.length() == 0) {
            System.out.println("No input was provided.");
        } else {
            System.out.println(counter);
        }
        scan.close();
    }
}