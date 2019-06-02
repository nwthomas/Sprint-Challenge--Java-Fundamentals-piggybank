package piggyBank;

public class Penny extends AbstractMoney
{
	private int value = 1;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Penny()
	{
		totalValue = value;
		return value;
	}

	public Penny(int coins)
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