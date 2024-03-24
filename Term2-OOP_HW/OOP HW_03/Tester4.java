import java.util.Scanner;

public class Tester4{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        Employee[] emp = new Employee[count];
        String fname, lname, position;
        char type;
        int salary, saleAmount;

        for(int i = 0; i < count; i++){
            type = kb.next().charAt(0);

            if(type == 'E'){
                fname = kb.next();
                lname = kb.next();
                salary = kb.nextInt();
                position = kb.next();

                emp[i] = new Employee(fname, lname, salary, position);
            }
            if(type == 'S'){
                fname = kb.next();
                lname = kb.next();
                salary = kb.nextInt();
                position = kb.next();
                saleAmount = kb.nextInt();

                emp[i] = new SaleMan(fname, lname, salary, position, saleAmount);
                emp[i].setSalary(emp[i].calculatePay());
            }
        }

        for (Employee empPrint : emp) {
            System.out.println(empPrint);
        }
    }
}