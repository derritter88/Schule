package Math;

import java.util.Scanner;

public class uebung1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Bitte Radius eingeben:");
		double r = s.nextDouble();
		System.out.println("Fläche:");
		double flaeche = Math.sqrt(r) * Math.PI;
		flaeche = Math.round(100.0 * flaeche) / 100.0;
		System.out.println(flaeche + " FE");
		System.out.println("************");
		System.out.println("Umfang:");
		double umfang = 2.0 * r * Math.PI;
		umfang = Math.round(100.0 * umfang) / 100.0;
		System.out.println(umfang + " ME");
	}

}
