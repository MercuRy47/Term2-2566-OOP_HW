package Wallet_3;

public class TestWallet {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        System.out.println("I have new wallet");
        System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
        w.putMoney(500);
        System.out.println("I put " + w.getCurrentBath() + " Bath to wallet");
        System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
        w.getMoney(200);
        System.out.println("I would like to eating buffet (use " + w.getUsemoney() + " bath)");
        System.out.println("Your get money " + w.getUsemoney() + " Bath");
        System.out.println("Your money in wallet : " + w.getCurrentBath());
        System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
        w.getMoney(170);
        System.out.println("I would like to eating buffet (use " + w.getUsemoney() + " bath)");
        System.out.println("Your get money " + w.getUsemoney() + " bath)");
        System.out.println("Your money in wallet : " + w.getCurrentBath());
        System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
        w.getMoney(200);
        System.out.println("I would like to eating buffet (use " + w.getUsemoney() + " bath)");
        w.Nomoney();
        System.out.println("Your money in wallet : " + w.getCurrentBath());
        System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
    }
}
