package piggyBank;

import java.util.*;

public class Main
{
	public static void workWithData()
	{
		ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();
		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		for (AbstractMoney c : piggyBank)
		{
			System.out.println(c.getTotalCoins());
		}
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}