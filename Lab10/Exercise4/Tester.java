package Exercise4;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException{
        File path = new File("Exercise4/text.txt");
        PrintWriter writing = new PrintWriter("Exercise4/revtext.txt");
        Scanner readFile = new Scanner(path);

        while (readFile.hasNext()) {
            String text = readFile.nextLine();
            StringBuilder reversed = new StringBuilder(text).reverse();
            System.out.println(reversed);
            writing.println(reversed);
        }
        writing.close();
    }
}
