package classes;

public class Client {
	
	
// Attributes
	private static int counter;
	private int id;
	private String name;
	private BankAccount bankAccount;
	
// Constructors	
	
	public Client(String name, BankAccount bankAccount) 
	{
		setName(name);
		setBankAccount(bankAccount);
		counter += 1;
		id = counter;
	}

	
// Getters
	public String getName()
	{
		 return name;
	}
	
	
// Setters
	
	private void setName(String name)
	{
		if (name != null && !name.isEmpty() && name.length() > 3)
		{
			this.name = name;
		} 
		else
		{
			System.err.println("The name can't be empty or null");
		}
		
	}
	
	private void setBankAccount (BankAccount bankAccount)
	{
	    // todo : add validation
		this.bankAccount = bankAccount;
	}
	
// Other methods
	
	public String toString()
	{
		return name + " " + bankAccount + " " + id; 
	}
	
	
	}

