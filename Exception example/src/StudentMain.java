import java.util.Scanner;

public class StudentMain
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		StudentReader r = new StudentReader(scanner);
		
		Student student = r.read();
		
		System.out.println(student.get("name"));
		System.out.println(student.get("birthyear"));
		System.out.println(student.get("averageMarks"));
	}

}
