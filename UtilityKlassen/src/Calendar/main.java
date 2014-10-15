package Calendar;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
		GregorianCalendar cal_1 = new GregorianCalendar();
		GregorianCalendar cal_2 = new GregorianCalendar();
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		cal_1.set(year, month, day);

		year = scan.nextInt();
		month = scan.nextInt();
		day = scan.nextInt();
		cal_2.set(year, month, day);

		long time = cal_2.getTime().getTime() - cal_1.getTime().getTime();
		long years = Math.round((double) time / (12. * 30 * 24 * 60. * 60. * 1000.));
		long months = Math.round((double) time / (30. * 24 * 60. * 60. * 1000.));
		long days = Math.round((double) time / (24. * 60. * 60. * 1000.));
		System.out.println("Zeitdifferenz: " + years + " Jahre " + months + " Monate " + days + " Tage");
	}
}
