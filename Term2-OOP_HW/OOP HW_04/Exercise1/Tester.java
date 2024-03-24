package Exercise1;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        char type = kb.next().charAt(0);

        if(type == 'R'){
            int width = kb.nextInt();
            int lenght = kb.nextInt();

            Shape shape = new Rectangle(width, lenght);
            System.out.printf("%.2f", shape.area());
        }else if(type == 'T'){
            int base = kb.nextInt();
            int height = kb.nextInt();

            Shape shape = new Triangle(base, height);
            System.out.printf("%.2f", shape.area());
        }
    } 
}