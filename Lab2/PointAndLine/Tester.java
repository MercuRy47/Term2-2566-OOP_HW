package PointAndLine;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);

        Line lineA = new Line(p1, p2);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(lineA.toString());
        System.out.printf("DISTANCE = %.2f\n", lineA.distance());
        
        p1.setLocation(2, 2);
        System.out.println(lineA.toString());
        System.out.printf("DISTANCE = %.2f\n", lineA.distance());
        double A = lineA.distance();

        Point p3 = new Point(2, 3);
        Point p4 = new Point(2, 5);
        Line lineB = new Line(p3, p4);
        System.out.println(lineB.toString());
        System.out.printf("DISTANCE = %.2f\n", lineB.distance());
        double B = lineB.distance();
        
        System.out.print("Input start point x and y : ");
        int xStart = kb.nextInt();
        int yStart = kb.nextInt();
        Point p5 = new Point(xStart, yStart);
        
        System.out.print("Input end point x and y : ");
        int xEnd = kb.nextInt();
        int yEnd = kb.nextInt();
        Point p6 = new Point(xEnd, yEnd);
        
        Line lineC = new Line(p5, p6);
        System.out.println(lineC.toString());
        System.out.printf("DISTANCE = %.2f\n", lineC.distance());
        double C = lineC.distance();

        double longest = Math.max(Math.max(A, B), C);
        String text = "";
        if(longest == C){
            text = "LineC";
        }else if(longest == B){
            text = "LineB";
        }else if(longest == A){
            text = "LineA";
        }
        System.out.println("Longst line is " + text);
    }
}