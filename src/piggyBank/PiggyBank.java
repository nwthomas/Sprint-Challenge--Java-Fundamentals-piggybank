package piggyBank;

public class PiggyBank 
{
	private static int bank = 0;
	private int dollar = 1000;
	private int quarter = 25;
	private int dime = 10;
	private int nickel = 5;
	private int penny = 1;

	public PiggyBank()
	{
		bank += 1;
	}

	public PiggyBank(int cents)
	{
		this.bank = cents;
	}
}