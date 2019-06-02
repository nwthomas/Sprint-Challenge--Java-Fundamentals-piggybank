package piggyBank;

public class Dime extends AbstractMoney
{
	private int value = 10;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Dime()
	{
		totalValue = value;
		return value;
	}

	public Dime(int coins)
	{
		totalValue = value * coins;
		totalCoins = coins;
		return totalValue;
	}

	@Override
	public static int getTotalValue()
	{
		return totalValue;
	}

	@Override
	public static int getTotalCoins()
	{
		return totalCoins;
	}
}