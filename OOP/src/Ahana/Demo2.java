package Ahana;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Client client = new Client(123,"Ali","123");
        accounts.add(new Account(1,1200,3,client));
        accounts.add(new Account(2,1300,2,client));
        accounts.get(0).withdraw(2000);
        accounts.get(0).withdraw(1000);
        accounts.get(0).deposit(100);

        for (Account account:accounts){
            System.out.println("Account "+account.getId()+":");
            System.out.println("W:"+account.countTransaction('W'));
            System.out.println("D:"+account.countTransaction('D'));
        }
        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));


    }
}
