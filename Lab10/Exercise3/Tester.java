package Exercise3;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException{
        File path = new File("Exercise3/student2.txt");
        Scanner readFile = new Scanner(path);

        while (readFile.hasNext()) {
            String text = readFile.nextLine();
            String[] list = text.split(" ");
            Double grade =  Double.valueOf(list[3]);

            char name = list[1].charAt(0);

            if(grade > 2.00){
                list[3] = "Pass";
            }else {
                list[3] = "Critical";
            }

            System.out.printf("%s %s. %s %s\n", list[0], name, list[2], list[3]);
        }

    }
}
