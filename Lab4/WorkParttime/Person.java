package WorkParttime;

public class Person {
    protected String fname;
    protected String lname;

    public Person(){
        fname = "unknow";
        lname = "unknow";
    }
    
    public void setPerson(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    
    public void showInfo(){
        System.out.println("Name: " + fname + " " + lname);
    }
}
