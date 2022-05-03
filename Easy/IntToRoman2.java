import java.util.Scanner;
public class IntToRoman2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an int to process: ");
        n = scan.nextInt();
        scan.nextLine();

        System.out.println(toRoman(n));
    }
    private static StringBuilder toRoman(int n) {
        StringBuilder output = new StringBuilder();
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < value.length; i++) {
            while (n >= value[i]) {
                output.append(roman[i]);
                n -= value[i];
            }
        }
        return output;
    }
    
}
