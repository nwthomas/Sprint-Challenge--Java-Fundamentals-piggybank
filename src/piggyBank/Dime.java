package piggyBank;

public class Dime extends AbstractMoney
{
	private int value = 10;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Dime()
	{
		totalCoins = 1;
		totalValue = value;
	}

	public Dime(int coins)
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
			return totalCoins + " Dime";
		}
		else 
		{
			return totalCoins + " Dimes";
		}
	}
}