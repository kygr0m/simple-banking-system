package classes;
import java.util.Scanner;

public class BankAccount
{
	private int countryCode;
	private int twoCheckDigit;
	private int bban;
	private String iban;
	
	
	public  BankAccount()
	{
		
	}
	

	public  BankAccount(String iban)
	{
		this.iban = iban;
	}
	
	public BankAccount(int countryCode , int twoCheckDigit, int bban )
	{
		this.countryCode = countryCode;
		this.twoCheckDigit = twoCheckDigit;
		this.bban = bban;
		
		this.iban =	setIban(countryCode, twoCheckDigit , bban );
	}
	
	
	
	
	public BankAccount createBankAccount()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Add the country code");
		int countryCode = scan.nextInt();
		
		System.out.println("Add the two check digits");
		int twoCheckDigit = scan.nextInt();
		
		System.out.println("Add the bban");
		int bban = scan.nextInt();
		
		
		BankAccount bankacc = new BankAccount(countryCode, twoCheckDigit, bban );
		
		return bankacc;


	}
	
	
	private String setIban(int countryCode , int twoCheckDigit, int bban)
	{
	
		return Integer.toString(countryCode) + Integer.toString(twoCheckDigit) + Integer.toString(bban);
	}
	
	
	/*private int randomNumber()
	{
		int max = 
	}*/
	
	public String toString()
	{
		return iban; 
	}

}
