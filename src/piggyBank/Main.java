package piggyBank;

import java.util.*;
import java.text.DecimalFormat;

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

		double total = 0;
		for (AbstractMoney c : piggyBank)
		{
			total += c.getTotalValue(); // Add up total in piggy bank for later use
			System.out.println(c.getTotalCoins()); // Print requested phrases to screen per README
		}

		DecimalFormat fp = new DecimalFormat("$###,###.00");
		System.out.println("The piggy bank holds " + fp.format(total));
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}