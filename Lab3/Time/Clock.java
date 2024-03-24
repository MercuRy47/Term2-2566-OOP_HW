package Time;

public class Clock {
    private int hour;
    private int minute;

    // Constructor
    public Clock(int hour, int minute){
        if(hour > 23 && minute > 59){
            System.out.println("Hour is incorrect. Setting hour to 0.");
            System.out.println("Minute is incorrect. Setting minute to 0.");
        }else if(hour > 23){
            System.out.println("Hour is incorrect. Setting hour to 0.");
        }else if(minute > 59){
            System.out.println("Minute is incorrect. Setting minute to 0.");
        }

        if(hour > 24 || hour < 0){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
        
        if(minute > 59 || minute < 0){
            this.minute = 0;
        }else if(minute > 59){
        }else {
            this.minute = minute;
        }
        
    }

    // SET
    public void setTime(int houe, int minute){
        this.hour = houe;
        this.minute = minute;
    }

    // GET
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }

    // Other
    public void increaseMinute(){
        this.minute += 1;
        if(minute > 59){
            this.minute = 0;
            this.hour++;
            if(hour > 23){
                this.hour = 0;
            }
        }
    }
    public void increaseHour(){
        this.hour += 1;
        if(hour > 24){
            this.hour = 0;
        }
    }
    public String toString(){
        if(hour < 10 && minute < 10){
            return  "0" + hour + ":" + "0" + minute;
        }else if(hour < 10) {
            return "0" + hour + ":" + minute;
        }else if(minute < 10){
            return hour + ":" + "0" + minute;
        }else {
            return hour + ":" + minute;
        }
    }
}
