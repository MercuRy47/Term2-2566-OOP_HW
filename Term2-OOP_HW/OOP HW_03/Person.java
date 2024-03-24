public class Person {
    protected String firstname;
    protected String lastname;

    // Constructor
    public Person(){
        firstname = "unknow";
        lastname = "unknow";
    }
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // SET
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    // GET
    public String getFirstname(){
        return firstname;
    }
    public String getLasttname(){
        return lastname;
    }

    // Other
    public String toString(){
        return "Person : " + firstname + " " + lastname;
    }
    
}
