import java.util.Scanner;

public class Tester2{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        Person[] emp = new Person[count];

        for(int i = 0; i < count; i++){
            String fname = kb.next();
            String lname = kb.next();
            int salary = kb.nextInt();
            String position = kb.next();

            emp[i] = new Employee(fname, lname, salary, position);
        }

        for (Person empPrint : emp) {
            System.out.println(empPrint);
        }
    }
}