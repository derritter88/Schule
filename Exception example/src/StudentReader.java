import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentReader
{
	Scanner scanner = new Scanner(System.in);
	 String s;
	 Student student;

	public StudentReader(String s, Student student)
	{
		this.s = s;
		this.student = student;
	}
int birthyear;
	int readBirthyear()

	{

		try
		{
			s = scanner.next();
			return birthyear = Integer.parseInt(s);
			
		}
		catch (InputMismatchException error)
		{
			System.out.println("falsche eingabe");
			return -1;
		}
		
	}
}
