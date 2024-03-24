package PersonAndWallet;

public class Person {
    public String firstname;
    public String lastname;
    public Wallet myWallet;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        myWallet = new Wallet();
    }

     public int checkMoney(){
        return myWallet.balance;
     }

     public void useMoney(int money){
        this.myWallet.getMoney(money);
     }

     public void saveMoney(int money){
        this.myWallet.putMoney(money);
     }

     public void changeNewWallet(Wallet wallet){
        myWallet.putMoney(wallet.balance);
     }

     public void printInfo(){
        System.out.println("Name : " + firstname + " " + lastname);
        System.out.println("Wallet : " + myWallet.balance);
     }
}
