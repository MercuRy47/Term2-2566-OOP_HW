package PersonAndWallet;

public class Wallet {
    public int balance;

    public Wallet(){
        this.balance = 0;
    }
 
    public int getBalance(){
        return balance;
    }

    public void putMoney(int money){
        this.balance += money;
    }
    public void getMoney(int money){
        this.balance -= money;
    }
}
