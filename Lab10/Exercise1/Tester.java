package Exercise1;

import java.io.*;
import java.util.Scanner;

public class Tester{
    public static void main(String[] args) throws IOException{
        File path = new File("Exercise1/stdent.txt");
        Scanner readFile = new Scanner(path);

        int countIT = 0;
        int countCS = 0;
        int countSE = 0;

        while (readFile.hasNext()) {
            String text = readFile.nextLine();
            String[] list = text.split(" ");

            if(list[1].equalsIgnoreCase("CS")){
                countCS++;
            }else if(list[1].equalsIgnoreCase("IT")){
                countIT++;
            }else if(list[1].equalsIgnoreCase("SE")){
                countSE++;
            }            
        }
        System.out.printf("There are %d persons in Computer Science\n", countCS);
        System.out.printf("There are %d persons in Information Technology\n", countIT);
        System.out.printf("There are %d persons in Software Engineering", countSE);
    }
}