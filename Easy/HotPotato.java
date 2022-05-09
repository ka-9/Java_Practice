import java.util.Scanner;
import java.util.ArrayList;
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Player1", "Player2", "Player3", "Player4"};
        String winner;
        int k;

        System.out.println("Enter k: ");
        k = scanner.nextInt();
        scanner.nextLine();
        
        winner = playHotPotato(names, k);
        if (winner != null) {
            System.out.println("The winner is: " + winner + "!");
        } else {
            System.out.println("The list is empty.");
        }
        scanner.close();
    }
    private static String playHotPotato(String[] names, int k) {
        if (names.length == 0) {
            return null;
        }
        ArrayList<String> players = new ArrayList<String>();
        for (String name : names) {
            if (name != null)
            players.add(name);
        }
        while (players.size() > 1) {
            for (int i = 0; i < k; i++) {
                players.add(players.remove(0));
            }
            System.out.println(players.remove(0) + " is out!");
        }
        if(players.size() > 0)
        return players.remove(0);

        return null;
    }
    
}
