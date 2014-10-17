package Math;

import java.util.Scanner;

public class uebung3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		double gravity = 9.81;

		System.out.println("Geschwindigkeit:");
		double v = s.nextDouble();
		System.out.println("Zeit:");
		double t = s.nextDouble();

		System.out.println("Winkel:");
		double a = s.nextDouble();

		double x = v * t * Math.cos(Math.toRadians(a));

		System.out.println("Erreichte Flugweite:");
		System.out.println(x + " m");
		System.out.println("Erreichte Flughöhe:");
		double y = v * t * Math.sin(Math.toRadians(a));
		System.out.println(y + " m");
	}

}
