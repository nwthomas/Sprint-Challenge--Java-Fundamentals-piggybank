package piggyBank;

public class Quarter extends AbstractMoney
{
	private int value = 25;
	private int totalValue = 0;
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
	public int getTotalValue()
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