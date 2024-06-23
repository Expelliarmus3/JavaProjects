package Ahana;

public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1122,20000,4.5);
        if(testAccount.withdraw(2500))
            System.out.println("Withdraw successful");
        else
            System.out.println("Withdraw unsuccessful");

        testAccount.deposit(3000);
        System.out.println("Id: "+testAccount.getId()+
                " Balance: "+testAccount.getBalance()+
                " Annual Interest: "+testAccount.getAnnualInterestRate());
    }
}
