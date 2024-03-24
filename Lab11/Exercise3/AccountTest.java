package Exercise3;

import java.util.*;

public class AccountTest {
    public static void main(String[] args) throws NegativeBalance {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter initial balance : ");
        try {
            BankAccount acc = new BankAccount(kb.nextDouble());
            System.out.println(acc);
        } catch (NegativeBalance e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Your input invalid"); 
        }

    }
}