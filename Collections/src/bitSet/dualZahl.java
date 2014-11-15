package bitSet;

import java.util.BitSet;
import java.util.Scanner;

public class dualZahl
{
	private static Scanner s;

	public static void main(String[] args)
	{
		BitSet bits = new BitSet();
		s = new Scanner(System.in);
		System.out.println("Dezimal in Dual umrechnen - Dezimalzahl eingeben:");
		int a = s.nextInt();
		String binary = Integer.toBinaryString(a);
		System.out.println(binary);

		for (int i = 0; i < binary.length(); i++)
		{

			if (binary.charAt(i) == '1')
			{
				bits.set(i);
			}

		}
		System.out.println("Folgendes Bits sind gesetzt: " + bits.toString());

		bits.clear();
		System.out.println("Dual in Dezimal umrechnen - Dual eingeben:");

		while (true)
		{
			try
			{
				binary = s.next();
				for (int i = 0; i < binary.length(); i++)
				{

					if (binary.charAt(i) == '1')
					{
						bits.set(i);
					}
				}
				System.out.println(bits);
				a = Integer.parseInt(binary, 2);
				System.out.println(a);
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Keine Binärzahl!");

			}
		}
	}
}
