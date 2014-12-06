package Iterator;

import java.util.ArrayList;

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
			// System.out.println(y);
		}

		for (int x : al)
		{
			int j = 2;
			if (x % j == 0)
			{
				al.remove(x);
			}

		}

	}
}
