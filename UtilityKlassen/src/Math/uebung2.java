package Math;

import java.util.Scanner;

public class uebung2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("p eingeben:");
		double p = s.nextDouble();
		System.out.println("q eingeben:");
		double q = s.nextDouble();

		double x1 = -p / 2 + Math.sqrt((Math.pow(p / 2, 2) - q));
		double x2 = -p / 2 - Math.sqrt((Math.pow(p / 2, 2) - q));
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}
}
