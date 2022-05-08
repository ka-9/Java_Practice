import java.util.Scanner;
public class SumOutsideFlags {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int values to process: ");

        int x=0;
        int sum = 0;
        boolean flag = true;

        while(x != -1){
            if (flag) sum += x;

            // scanner.nextInt() has to be directly after the 7 flag because if 7 is directly followed by -1 we dont want x += -1
            if (x==7) flag = true;
            x = scanner.nextInt();

            if(x == 6) flag = false;
        }

        System.out.println(sum);
        scanner.close();    
    
    }
}
