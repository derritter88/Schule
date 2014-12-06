package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class test
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int x = 1; x <= 20; x++)
		{
			al.add(x);
		}

		for (int y : al)
		{
			System.out.println(y);
		}

		Iterator it = al.listIterator();

		while (it.hasNext())
		{
			int x = (int) it.next();

			if (x % 2 != 0)
			{
				it.remove();
			} else if (it.hasNext())
			{
				System.out.println(it.next().toString());
			}

		}

	}
}
