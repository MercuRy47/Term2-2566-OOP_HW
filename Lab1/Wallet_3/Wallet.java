package Wallet_3;

public class Wallet {
    public int money;
    public int usemoney;

    public void Nomoney(){
        System.out.println("Can't get money, because you money not enough");
    }

    Wallet(){
        this.money = 0;
    }

    public int getCurrentBath(){
        return money;
    }
    public int getUsemoney(){
        return usemoney;
    }

    public void putMoney(int money){
        this.money = money;
    }

    public int getMoney(int usemoney){
        this.usemoney = usemoney;
        if(this.money - usemoney < 0){
            return money;
        }else {
            return this.money -= usemoney;
        }
    }
}
