package Exercise3;

public class BankAccount implements Measurable{
    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo(){
        return accNo;
    }

    public void setAccNo(String accNo){
        this.accNo = accNo;
    }

    public double getMesurable(){
        return balance;
    }
}
