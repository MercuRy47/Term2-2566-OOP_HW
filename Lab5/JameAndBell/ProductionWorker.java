package JameAndBell;
public class ProductionWorker extends Employee{
    protected String shift;
    protected double hourlyPerRate;

    // Constructor
    public ProductionWorker(){
        
    }
    public ProductionWorker(String shift, double hourlyPerRate){
        this.shift = shift;
        this.hourlyPerRate = hourlyPerRate;
    }

    // GET
    public double getHourlyPerRate(){
        return hourlyPerRate;
    }


    // SET


    // Other
    public void showInfo(){
        System.out.println("Shift = " + shift);
        System.out.println("Rate = " + hourlyPerRate);
    }
}
