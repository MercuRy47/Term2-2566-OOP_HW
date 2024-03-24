package Exercise2;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException{
        File path = new File("Exercise2/score.txt");
        Scanner readFile = new Scanner(path);

        while (readFile.hasNext()) {
            int[] list = new int[2];
            list[0] = readFile.nextInt();
            list[1] = readFile.nextInt();

            if(list[1] > 60){
                System.out.printf("ID : %d Grade : S\n", list[0]);
            }else {
                System.out.printf("ID : %d Grade : U\n", list[0]);
            }
        }

    }
}
