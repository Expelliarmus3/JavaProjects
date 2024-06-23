package Ahana;

public class Demo {
    public static void main(String[] args) {
        Client[] clients= new Client[2];//null,null

        clients[0]= new Client(100,"Ali","123");
        clients[0].addAccount(new Account(1,1000,1.5));
        clients[0].addAccount(new Account(2,2000,2.5));

        clients[1]= new Client(200,"Deli","12345");

        clients[1].addAccount(new Account(3,3000,3.5));
        clients[1].addAccount(new Account(4,4000,4.5));
        clients[1].addAccount(new Account(5,5000,5.5));

        System.out.println(clients[0]);
        System.out.println(clients[1]);

    }
}
