import java.util.Scanner;
interface atm
{
    public void deposit(int amt);
    public void withdraw (int amt);
    public void cheakbalance ();

}
class user_bank implements atm
{
    private int balance;
    public String name;
    public user_bank(String name)
    {
        this.balance=0;
        this.name=name;
    }
    public void deposit (int amt)
    {
        this.balance=this.balance + amt;
        System.out.println(amt + " is DEPOSIT to your account ");
    }
    public void withdraw(int amt)
    {
        if (amt <this.balance)
        {
            this.balance=this.balance-amt;
            System.out.println(amt + "is WITHDRAW from your account ");
        }
        else
        {
            System.out.println("you have been INSUFFICIENT balance ");
        }
    }

    public void cheakbalance()
    {
        System.out.println("your BALANCE is"+this.balance);

    }

}


public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new  Scanner(System.in);
        user_bank u1 =new user_bank("Darshak");
        System.out.println("HELLO..." +u1.name+ " welcome ");

        while (true)
        {
            System.out.println("1. Deposite ");
            System.out.println("2. Withdraw");
            System.out.println("3. Checkbalance");
            System.out.println("4. exit");
            int choice =sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter amount to deposit :");
                    int amt =sc.nextInt();
                    u1.deposit(amt);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw :");
                    int Amt= sc.nextInt();
                    u1.withdraw(Amt);
                    break;

                case 3:
                    u1.cheakbalance();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("OPP...It Is Invalid Option");
                    break;

            }
        }
    }
}