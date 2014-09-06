import java.util.Scanner;


public class StudentReader {

	Scanner input = new Scanner(System.in);
	Student student = input.next();
	
	public StudentReader(Scanner input, String student) {
		super();
		this.input = input;
		this.student = student;
	}
	
	
	
}
