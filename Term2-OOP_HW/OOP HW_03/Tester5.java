import java.util.Scanner;

public class Tester5{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        Employee[] emp = new Employee[count];
        String fname, lname, position;
        char type;
        int salary, saleAmount, managerAmount;

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
            if(type == 'M'){
                fname = kb.next();
                lname = kb.next();
                salary = kb.nextInt();
                position = kb.next();
                managerAmount = kb.nextInt();

                emp[i] = new Manager(fname, lname, salary, position, managerAmount);
                emp[i].setSalary(emp[i].calculatePay());
            }
        }

        for (Employee empPrint : emp) {
            System.out.println(empPrint);
        }
    }
}