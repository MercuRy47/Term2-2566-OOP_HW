import java.util.Scanner;

public class Tester1{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        Person[] person = new Person[count];

        for(int i = 0; i < count; i++){
            String fname = kb.next();
            String lname = kb.next();

            person[i] = new Person(fname, lname);
        }

        for (Person personPrint : person) {
            System.out.println(personPrint);
        }
    }
}