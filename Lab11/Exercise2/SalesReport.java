package Exercise2;

import java.util.*;
import java.io.*;

public class SalesReport {
    public static void main(String[] args) throws FileNotFoundException {
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;
        Scanner kb = new Scanner(System.in);
        try {
            String filename = kb.nextLine();
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
    
                oneMonth = inputFile.nextDouble();
                totalSales += oneMonth;
                months++;
    
            }
            inputFile.close();
            averageSales = totalSales / months;
            System.out.println("Number of months : " + months);
            System.out.println("Total Sales : " + totalSales);
            System.out.println("Average Sales : " + averageSales);
        } catch (FileNotFoundException e){
            System.out.println("File is not exist"); 
        } catch (InputMismatchException e){
            System.out.println("Your input mis match");    
        }
    }
}