package Exercise1;

public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public String checkStatus(){
        String status = "unknow";
        if(gpa > 2.00){
            status = "Normal";
        }else if(gpa < 2.00 && gpa > 1.75){
            status = "Probation";
        }else if(gpa < 1.75){
            status = "Retired";
        }
        return status;
    }

    public String getType(){
        String thisType = "unknow";
        String inputid = Integer.toString(id);
        if(inputid.charAt(2) == '1'){
            thisType = "Day";
        }else if(inputid.charAt(2) == '6'){
            thisType = "Special";
        }  
        return thisType;
    }
}
