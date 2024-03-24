package Zoo;

public class Organ {
    private String type;

    // Constructor
    public Organ(){
        type = "unknow";
    }
    public Organ(String type){
        this.type = type;
    }

    // GET
    public String getType(){
        return type;
    }

    // SET
    public void setType(String type){
        this.type = type;
    }
}
