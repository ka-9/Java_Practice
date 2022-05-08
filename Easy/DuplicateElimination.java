import java.util.Scanner;
public class DuplicateElimination {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Enter a string to process: ");
        str = scan.nextLine();

        String output = "";
        for (int idx1 = 0; idx1 < str.length(); idx1++) {
            if (output.indexOf(str.charAt(idx1)) == -1) {
                output += str.charAt(idx1);
            }
        }
        System.out.println(output);
        scan.close();
    }
    
    
}
