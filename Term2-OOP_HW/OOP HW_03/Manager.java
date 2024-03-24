public class Manager extends Employee{
    protected int cashPosition;

    // Constructor
    public Manager(){
        cashPosition = 0;
    }
    public Manager(String firstname, String lastname, int salary, String position, int cash){
        super(firstname, lastname, salary, position);
        this.cashPosition = cash;
    }

    // Other
    public int calculatePay(){
        
        return super.calculatePay() + cashPosition;
    }
}
