package JameAndBell;
import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // EMP1
        Employee p1 = new Employee("Jame", "123-A", "1-1-2561");
        ProductionWorker pw1 = new ProductionWorker("Day", 50);
        p1.showInfo();
        pw1.showInfo();
        System.out.println();

        // EMP2
        Employee p2 = new Employee("Bell", "222-A", "2-2-2561");
        ProductionWorker pw2 = new ProductionWorker("Night", 100);
        p2.showInfo();
        pw2.showInfo();
        System.out.println();

        int hourJ, hourB;
        double salaryJ, salaryB;

        System.out.print("Enter the number of working hours for Jame : ");
        hourJ = kb.nextInt();
        salaryJ = pw1.getHourlyPerRate()*hourJ;
        System.out.println("Salary of Jame = " + salaryJ);
        
        System.out.print("Enter the number of working hours for Bell : ");
        hourB = kb.nextInt();
        salaryB = pw2.getHourlyPerRate()*hourB;
        System.out.println("Salary of Jame = " + salaryB);

        if(salaryJ > salaryB){
            System.out.println(p1.getName() + " has more salary than " + p2.getName() + " = " + (salaryJ - salaryB));
        }else if(salaryJ < salaryB){
            System.out.println(p2.getName() + " has more salary than " + p1.getName() + " = " + (salaryB - salaryJ));
        }else {
            System.out.println(p1.getName() + " and " + p2.getName() + " get the same salary.");
        }
    }
}