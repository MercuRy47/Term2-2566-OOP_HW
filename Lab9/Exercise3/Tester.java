package Exercise3;

import java.util.*;

public class Tester{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<BankAccount> bankList = new ArrayList<>();

        System.out.print("Enter the number of BankAccount : ");
        int n = kb.nextInt();

        for(int i = 0; i < n; i++){
            String accNo = kb.next();
            int balance = kb.nextInt();

            bankList.add(new BankAccount(accNo, balance));
        }
        bankList.forEach(bl -> System.out.printf("Acc no : %s Balance : %.1f\n", bl.getAccNo(), bl.getMesurable()));

        System.out.print("Enter the number of PiggyBank : ");
        int n2 = kb.nextInt();

        double sum = 0;
        for(int j = 0; j < n2; j++){

            System.out.print("Enter size and number of deposit : ");
            int size = kb.nextInt();
            PiggyBank piggyBank = new PiggyBank(size);
            n = kb.nextInt();

            int totalCount = 0;
            int oldtotalCount = 0;

            for(int i = 0; i < n; i++){
                int type = kb.nextInt();
                int count = kb.nextInt();
                totalCount += count;
                if(type == 1){
                    if(totalCount <= size){
                        piggyBank.addOne(count * 1);
                    }else if(totalCount > size){
                        oldtotalCount = totalCount - count;
                        count = size - (totalCount - count);
                        totalCount = oldtotalCount + count;
                        piggyBank.addOne(count * 1);
                    }
                }else if(type == 5){
                    if(totalCount <= size){
                        piggyBank.addFive(count * 5);
                    }else if(totalCount > size){
                        oldtotalCount = totalCount - count;
                        count = size - (totalCount - count);
                        totalCount = oldtotalCount + count;
                        piggyBank.addFive(count * 5);
                    }
                }else if(type == 10){
                    if(totalCount <= size){
                        piggyBank.addTen(count * 10);
                    }else if(totalCount > size){
                        oldtotalCount = totalCount - count;
                        count = size - (totalCount - count);
                        totalCount = oldtotalCount + count;
                        piggyBank.addTen(count * 10);
                    }
                }
            }
            sum = piggyBank.getMesurable();
            System.out.printf("Total : %.1f\n", sum);
        }
    }
}