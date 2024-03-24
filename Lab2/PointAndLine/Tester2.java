package PointAndLine;

import java.util.Scanner;

public class Tester2{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 5);
        
        Line lineA = new Line(p1, p2);

        System.out.println(lineA.toString());
        System.out.printf("DISTANCE = %.2f", lineA.distance());
        
        System.out.print("Input start point x and y : ");
        int xStart = kb.nextInt();
        int yStart = kb.nextInt();
        p1.setLocation(xStart, yStart);
        
        System.out.print("Input end point x and y : ");
        int xEnd = kb.nextInt();
        int yEnd = kb.nextInt();
        p1.setLocation(xEnd, yEnd);
        System.out.println(lineA.toString());
        System.out.printf("DISTANCE = %.2f", lineA.distance());


        
    }
}