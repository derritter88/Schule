package Random;

import java.util.Random;

public class irgendwas
{

	public static void main(String[] args)
	{
		Random rd = new Random();

		for (int x = 0; x < 6; x++)
		{
			int zahl = rd.nextInt(49) + 1;
		}

	}
}
