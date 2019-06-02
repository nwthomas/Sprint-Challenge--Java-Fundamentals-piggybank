package piggyBank;

public class Dollar extends AbstractMoney
{
	private int value = 100;
	private int totalValue = 0;
	private int totalCoins = 0;

	public Dollar()
	{
		totalCoins = 1;
		totalValue = value;
	}

	public Dollar(int coins)
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
		return "$" + totalCoins;
	}
}