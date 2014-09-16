import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentReader
{
	private Scanner scanner;

	public StudentReader(Scanner scanner)
	{
		this.scanner = scanner;
	}

	public Student read()
	{
		int birthday = readBirthyear();
		int[] marks = readMarks();
		String name = readName();

		return new Student(name, birthday, marks);
	}

	int readBirthyear()
	{

		do
		{
			try
			{
				System.out.println("Geburtsjahr eingeben:");
				String s = scanner.next();
				int birthday = Integer.parseInt(s);
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTimeInMillis(System.currentTimeMillis());
				cal.add(GregorianCalendar.YEAR, -birthday);
				int diff = cal.get(GregorianCalendar.YEAR);

				if (diff > 110)
				{
					throw new TooOldException();
				}

				return birthday;

			} catch (NumberFormatException error)
			{
				System.out.println("Nur Zahlen erlaubt!");
				return -1;
			} catch (TooOldException ex)
			{
				System.out.println("Bitte Geburtsjahr ändern.");
				return -1;
			}
		} while (readBirthyear() == -1);

	}

	private String readName()
	{
		System.out.println("Name eingeben:");
		String s = scanner.next();

		int index = s.indexOf(',');
		if (index == -1)
		{
			System.out.println("Bitte Namen mittels , teilen.");
		}

		return readName();
	}

	// TODO name noch mittels groß- und kleinbuchstaben überprüfen

	private int[] readMarks()
	{
		int[] marks = new int[10];
		try
		{
			System.out.println("Bitte Noten eingeben.");
			for (int i = 0;; i++)
			{
				int a = scanner.nextInt();
				marks[i] = a;
				if (a == 0)
				{
					return marks;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Zu viele Werte eingegeben!");

		} catch (InputMismatchException e)
		{
			System.out.println("Nur Zahlen erlaubt!");
		}
		return marks;
	}
}
