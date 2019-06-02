package piggyBank;

public class Quarter extends AbstractMoney
{
	private int value = 25;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Quarter()
	{
		totalValue = value;
		return value;
	}

	public Quarter(int coins)
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