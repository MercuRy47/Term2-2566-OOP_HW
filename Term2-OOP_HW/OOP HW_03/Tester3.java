import java.util.Scanner;

public class Tester3{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        String fname, lname, position;
        int salary;
        Employee[] emp = new Employee[count];
        Employee[] empUp = new Employee[count];

        for(int i = 0; i < count; i++){
            fname = kb.next();
            lname = kb.next();
            salary = kb.nextInt();
            position = kb.next();
            
            emp[i] = new Employee(fname, lname, salary, position);;
        }
        int percent = kb.nextInt();
        empUp = emp;
        
        for (Employee empPrint : emp) {
            System.out.println(empPrint);
        }
        
        System.out.println("After update salary");
        for(int i = 0; i < count; i++){
            empUp[i].upSalary(percent);
        }
        for (Employee empPrint : empUp) {
            System.out.println(empPrint);
        }
    }
}