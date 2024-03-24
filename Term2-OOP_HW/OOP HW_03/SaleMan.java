public class SaleMan extends Employee{
    protected int saleAmount;

    // Constructor
    public SaleMan(){
        saleAmount = 0;
    }
    public SaleMan(String firstname, String lastname, int salary, String position, int saleAmount){
        super(firstname, lastname, salary, position);
        this.saleAmount = saleAmount;
    }

    // Other
    public int calculatePay(){
        
        return super.calculatePay() + (int)(0.05 * saleAmount);
    }
}
