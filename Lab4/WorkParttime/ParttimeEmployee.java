package WorkParttime;

public class ParttimeEmployee extends Person{
    protected int hour;
    protected int parttime;

    public ParttimeEmployee(){
        hour = 0;
        parttime = 0;
    }

    public ParttimeEmployee(String fname, String lname,int hour){
        super.setPerson(fname, lname);
        this.hour = hour;
        if(hour > 0){
            parttime = 300 * hour;
        }else {
            parttime = 0;
        }
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Part-Time(300 Bath/ 1 Hour): " + hour + " Hour");
        System.out.println("Wage: " + parttime + " Bath");
    }
}
