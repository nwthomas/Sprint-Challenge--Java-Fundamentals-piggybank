package piggyBank;

public class Nickel extends AbstractMoney
{
	private double value = 0.05;
	private double totalValue = 0;
	private int totalCoins = 0;

	public Nickel()
	{
		totalCoins = 1;
		totalValue = value;
	}

	public Nickel(int coins)
	{
		totalValue = value * coins;
		totalCoins = coins;
	}

	@Override
	public double getTotalValue()
	{
		return totalValue;
	}

	@Override
	public String getTotalCoins()
	{
		if (totalCoins == 1)
		{
			return totalCoins + " Nickel";
		}
		else 
		{
			return totalCoins + " Nickels";
		}
	}
}