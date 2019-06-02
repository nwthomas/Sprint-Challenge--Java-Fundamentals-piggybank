package piggyBank;

public class Quarter extends AbstractMoney
{
	private double value = 0.25;
	private double totalValue = 0;
	private int totalCoins = 0;

	public Quarter()
	{
		totalCoins = 1;
		totalValue = value;
	}

	public Quarter(int coins)
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
			return totalCoins + " Quarter";
		}
		else 
		{
			return totalCoins + " Quarters";
		}
	}
}