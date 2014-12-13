package set;

import java.util.Iterator;
import java.util.TreeSet;

public class test
{

	@SuppressWarnings(
	{ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{

		TreeSet hs = new TreeSet();
		int doppel = 0;

		while (hs.size() < 3)
		{
			int wuerfel = (int) (Math.random() * 6) + 1;

			if (hs.add(wuerfel) == true)
			{
				hs.add(wuerfel);
			}
			else
			{
				doppel++;
			}

		}
		Iterator it = hs.descendingIterator();
		while (it.hasNext())
		{

			System.out.println("Die Würfe waren: " + it.next());

		}
		if (doppel != 0)
		{
			System.out.println("Zahl mehrfach gewürfelt: " + doppel + "x");
		}

	}
}
