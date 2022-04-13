import java.util.Scanner;
public class EligibilityChecker {
    public static void main (String[] args) {
        if (checkEligibility(inputAge())) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
    private static int inputAge() {
        Scanner scan = new Scanner(System.in);
        int age = 0;

        do {
        System.out.println("Please enter your age: ");
        age = scan.nextInt();
        } while (age < 1 || age > 130);
        
        return age;
    }

    private static boolean checkEligibility (int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
}
