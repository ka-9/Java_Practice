package Intermediate;
import java.util.Scanner;
public class MathExpress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operators = "+-*/", expression = "";
        System.out.println("Enter an expression: ");
        expression = scan.nextLine();
        int i = 0;
        while(operators.indexOf(expression.charAt(i)) < 0) {
            i++;
            if (i == expression.length()-1) {
                System.out.println(expression);
                break;
            }
        }
        double s1 = 0, s2 = 0;
        char operand = expression.charAt(i);
        if (i < expression.length()-1) {
        s1 = Double.parseDouble(expression.substring(0, i));
        s2 = Double.parseDouble(expression.substring(i + 1));
        }
        switch(operand) {
            case '+':
            System.out.println(s1+s2);
            break;
            case '-':
            System.out.println(s1-s2);
            break;
            case '*':
            System.out.println(s1*s2);
            break;
            case '/':
            System.out.println(s1/s2);
            break;
        }
        scan.close();
    }
    
}
