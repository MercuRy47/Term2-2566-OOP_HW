import java.util.Scanner;

public class Tester4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator, numerator2, denominator2;

        numerator = kb.nextInt();
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);

        numerator2 = kb.nextInt();
        denominator2 = kb.nextInt();
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        // 4
        fraction.divide(fraction2).makeNewFormat().print();
       
    }
}