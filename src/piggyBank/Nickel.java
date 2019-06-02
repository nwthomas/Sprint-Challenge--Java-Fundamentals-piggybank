package piggyBank;

public class Nickel extends AbstractMoney
{
	private int value = 5;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Nickel()
	{
		totalValue = value;
		return value;
	}

	public Nickel(int coins)
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