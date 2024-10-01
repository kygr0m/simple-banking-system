package classes;

public class Bank
{

	public static void main(String[]args)
	{
		 BankAccount acc1 = new BankAccount(20);
		 BankAccount acc2 = new BankAccount(20);
		 Client client1 = new Client("Jakob", acc1);
		 Client client2 = new Client("Marie", acc2);
		 
		 System.out.println(client1.toString());
		 System.out.println(client2.toString());
		 
	}
}
