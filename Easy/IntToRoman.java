import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

// Brute force approach
public class IntToRoman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an int to convert");
        n = scan.nextInt();
        scan.nextLine();

        toRoman(n);
    }
    private static void toRoman(int n) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');

        ArrayList<Integer> list = new ArrayList<>();
        // integer decomposition
        while (n > 0) {
            Integer N = (n%10);
            list.add(N);
            n /= 10;
        }
        String output = "";
        System.out.println(list);
        for (int idx = list.size() -1; idx >=0; idx--) {
            if (list.get(idx) == 0) {
                continue;
            } else if (list.get(idx) == 4) {
                switch (idx) {
                    case 2:
                    output += "CD";
                    break;
                    case 1:
                    output += "XL";
                    break;
                    case 0:
                    output += "IV";
                }
            } else if (list.get(idx) == 9) {
                switch (idx) {
                    case 2:
                    output += "CM";
                    break;
                    case 1:
                    output += "XC";
                    break;
                    case 0:
                    output += "IX";
                }
            } else if (list.get(idx) / 5 < 1) {
                for (int idx2 = 0; idx2 < list.get(idx); idx2++) {
                    output += map.get((int)(Math.pow(10, idx)));
                }
            } else {
                output += map.get((int) (5 * Math.pow(10, idx)));
                for (int idx2 = 0; idx2 < list.get(idx) -5; idx2++) {
                    output += map.get((int)(Math.pow(10, idx)));
                }
            }
        }
        System.out.println(output);

    }
}