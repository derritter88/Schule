package Random;

import java.util.Random;

public class irgendwas
{

	public static void main(String[] args)
	{
		Random f = new Random(1910);
		int t = f.nextInt();
		Random rd = new Random();
		Random rdl = new Random(t);
		for (int x = 0; x < 6; x++)
		{

			int zahl = rd.nextInt(49) + 1;
			while (zahl != 0)
			{
				System.out.println(zahl);
				break;
			}
		}

		System.out.println("******************");
		System.out.println("Deine Lieblingszahlen sind aber:");
		for (int k = 0; k < 6; k++)
		{
			int liebling = rdl.nextInt(49) + 1;
			while (liebling != 0)
			{
				System.out.println(liebling);
				break;
			}
		}
	}
}
