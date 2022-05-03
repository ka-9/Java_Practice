import java.util.Scanner;
import java.util.HashMap;
public class RomanToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Enter a String to process: ");
        s = scanner.nextLine();
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int current;
        int next; 

        for (int idx = 0; idx < s.length() -1; idx++) { // MCDLXXVI MCMXCIV MMCDXXV CDLI
            current = map.get(s.charAt(idx));
            next = map.get(s.charAt(idx + 1));
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        result += map.get(s.charAt(s.length()-1));
        return result;   
    }
}
    
