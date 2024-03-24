package Exercise1;

import java.util.*;

public class Ex1 { 
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter index of array : ");

        try {
            int n = kb.nextInt();
        System.out.println(numbers[n]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception");
        } catch (InputMismatchException e){
            System.out.println("Your input mis match");
        }
    }  
}