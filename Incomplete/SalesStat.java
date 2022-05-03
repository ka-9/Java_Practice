package Incomplete;

import java.util.Scanner;
import java.io.*;
public class SalesStat {
    public static void main(String[] args) throws IOException {
        File f = new File("sales.txt");
        Scanner scan = new Scanner(f);
        scan.useDelimiter(":");
        int counter = 0;
        int nbOfCities = 0;
        double grandTotal = 0;
        while (scan.hasNext()) {
            String line = scan.nextLine();
            Scanner scanLine = new Scanner(line);
            scanLine.next();
            grandTotal += scan.nextDouble();
            nbOfCities++;
        }
        System.out.println("Nb of cities: " + nbOfCities + "\nGrand Total: " + grandTotal);
    }
    
}
