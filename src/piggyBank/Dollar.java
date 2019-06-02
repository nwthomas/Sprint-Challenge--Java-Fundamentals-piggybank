package piggyBank;

public class Dollar extends AbstractMoney
{
	private int value = 100;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Dollar()
	{
		totalValue = value;
		return value;
	}
	
	public Dollar(int coins)
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