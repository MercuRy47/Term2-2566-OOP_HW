package BOX;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Rectangle
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();

        System.out.print("Enter length of R1: ");
        int lengthR1 = kb.nextInt();
        System.out.print("Enter width of R1: ");
        int widthR1 = kb.nextInt();
        R1.setDimension(lengthR1, widthR1);

        System.out.print("Enter length of R2: ");
        int lengthR2 = kb.nextInt();
        System.out.print("Enter width of R2: ");
        int widthR2 = kb.nextInt();
        R2.setDimension(lengthR2, widthR2);

        System.out.println(R1.toString());
        System.out.println(R2.toString());
        
        System.out.println("Area of R1 = " + R1.area() + " Area of R2 = " + R2.area());

        if(R1.area() > R2.area()){
            System.out.println("R1 is bigger than R2");
        }else if(R1.area() < R2.area()){
            System.out.println("R1 is smaller than R2");
        }else {
            System.out.println("R1 is equal to R2");
        }


        // Box
        Box B1 = new Box();
        Box B2 = new Box();

        System.out.print("Enter [width, length, depth] of B1: ");
        int widthB1 = kb.nextInt();
        int lengthB1 = kb.nextInt();
        int depthB1 = kb.nextInt();
        B1.setDimension(lengthB1, widthB1, depthB1);

        System.out.print("Enter [width, length, depth] of B2: ");
        int widthB2 = kb.nextInt();
        int lengthB2 = kb.nextInt();
        int depthB2 = kb.nextInt();
        B2.setDimension(lengthB2, widthB2, depthB2);

        System.out.println(B1.toString());
        System.out.println(B2.toString());

        System.out.println("Volumn of B1 = " + B1.volumn() + " Volumn of B2 = " + B2.volumn());

        if(B1.volumn() > B2.volumn()){
            System.out.println("B1 is more space than B2");
        }else if(B1.volumn() < B2.volumn()){
            System.out.println("B1 is little space than B2");
        }else {
            System.out.println("B1 is equal to B2");
        }
    }
}
