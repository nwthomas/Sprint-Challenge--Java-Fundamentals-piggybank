package piggyBank;

public class Dollar extends AbstractMoney
{
	private double value = 1.00;
	private double totalValue = 0;
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
	public double getTotalValue()
	{
		return totalValue;
	}

	@Override
	public String getTotalCoins()
	{
		return "$" + totalCoins;
	}
}