package Exercise2;

public class DvdMovie implements RetailItem{
    private String tittle;
    private int runningTime;
    private double retailPrice;

    public DvdMovie(String tittle, int runningTime, double retailPrice){
        this.tittle = tittle;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;
    }

    public String getTittle(){
        return tittle;
    }

    public int getRunningTime(){
        return runningTime;
    }

    public double getRetailPrice(){
        return retailPrice;
    }
}
