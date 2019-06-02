package piggyBank;

public class Penny extends AbstractMoney
{
	private int value = 1;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Penny()
	{
		totalCoins = 1;
		totalValue = value;
	}

	public Penny(int coins)
	{
		totalValue = value * coins;
		totalCoins = coins;
	}

	@Override
	public int getTotalValue()
	{
		return totalValue;
	}

	@Override
	public String getTotalCoins()
	{
		if (totalCoins == 1)
		{
			return totalCoins + " Penny";
		}
		else 
		{
			return totalCoins + " Pennies";
		}
	}
}