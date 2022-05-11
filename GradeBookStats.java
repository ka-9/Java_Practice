import java.util.Scanner;
import java.text.DecimalFormat;
public class GradeBookStats {
    public static void main(String[] args){
        DecimalFormat fmt = new DecimalFormat("0.##");
        Scanner scanner = new Scanner(System.in);
        int nbStudent, nbCourses;

        do {
            System.out.println("Enter the number of students: ");
            nbStudent = scanner.nextInt();
            scanner.nextLine();
        } while (nbStudent < 0);

        do {
            System.out.println("Enter the number of courses: ");
            nbCourses = scanner.nextInt();
            scanner.nextLine();
        } while (nbCourses < 0);

        int[][] gradeBook = new int[nbStudent][nbCourses];

        for (int i = 0; i < nbStudent; i++) {
            System.out.println("Enter grades for student #" + (i+1) + " on all " + nbCourses + " courses :");
            for (int j = 0; j < nbCourses; j++) {
                gradeBook[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        int sum; 
        double average;
        for (int i = 0; i < nbCourses; i++) {
            sum = 0;
            average = 0;
            for (int j = 0; j < nbStudent; j++){
                sum+= gradeBook[j][i];
            }
            average = sum / (double) nbStudent;
            System.out.println("The avg grade for course #" + (i+1) + ": " + fmt.format(average));
        }

        for (int i = 0; i < nbStudent; i++) {
            sum = 0;
            average = 0;
            for (int j = 0; j < nbCourses; j++) {
                sum+= gradeBook[i][j];
            }
            average = sum / (double) nbCourses;
            System.out.println("The avg grade for student #" + (i+1) + ": " + fmt.format(average));
        }
        scanner.close();
    }
}
