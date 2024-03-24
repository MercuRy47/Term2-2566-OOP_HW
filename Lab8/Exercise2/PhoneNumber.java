package Exercise2;

public class PhoneNumber {
    private String name;
    private String phone_number;

    public PhoneNumber(String name, String phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Name = '" + name + "' Phone = '" + phone_number + "'";
    }
}
