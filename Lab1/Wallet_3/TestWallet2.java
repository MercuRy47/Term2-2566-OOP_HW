package Wallet_3;

import java.util.Scanner;

public class TestWallet2 {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        Scanner kb = new Scanner(System.in);

        System.out.println("I have new wallet");
        System.out.println("====================");
        System.out.println("Current wallet = 1");
        System.out.println("Put wallet = 2");
        System.out.println("Get money = 3");
        System.out.println("Exit = -1");
        System.out.println("====================");
        while (true) {
            int num = kb.nextInt(); 
            if(num == 1){
                System.out.println("Your money in wallet : " + w.getCurrentBath());
                System.out.println("Current wallet have : " + w.getCurrentBath() + " Bath");
            }else if(num == 2){
                int put = kb.nextInt();
                w.putMoney(put);
                System.out.println("I put " + w.getCurrentBath() + " Bath to wallet");
            }else if(num == 3){
                int get = kb.nextInt();
                w.getMoney(get);
                System.out.println("I would like to eating buffet (use " + w.getUsemoney() + " bath)");
                if(w.getCurrentBath() - w.getUsemoney() < 0){
                    w.Nomoney();
                }else {
                    System.out.println("Your get money " + w.getUsemoney() + " Bath");
                }
            }else if(num == -1){
                System.exit(num);
            }
        }
    }
}
