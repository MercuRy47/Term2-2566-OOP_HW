package Exercise3;

public class PiggyBank implements Measurable{
    private int one;
    private int five;
    private int ten;
    private int size;

    public PiggyBank(int size){
        this.size = size;
    }

    public void addOne(int n){
        this.one += n;  
    }

    public void addFive(int n){
        this.five += n;
    }

    public void addTen(int n){
        this.ten += n;
    }

    public double getMesurable(){
        return one + five + ten;
    }
}
