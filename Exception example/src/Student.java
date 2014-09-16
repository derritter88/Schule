public class Student
{
	private String name;
	private int birthyear;
	private int[] marks = new int[10];

	public Student(String name, int birthyear, int[] marks)
	{
		super();
		this.name = name;
		this.birthyear = birthyear;
		this.marks = marks;
	}

	public String getName()
	{
		return name;
	}

	public int getBirthyear()
	{
		return birthyear;
	}

	public int[] getMarks()
	{
		return marks;
	}

	float getAverageMark()
	{
		try
		{
			int sum = 0;

			for (int i = 0; i < marks.length; i++)
			{
				sum += marks[i];
			}

			return (float) sum / marks.length;
		} catch (ArithmeticException ex)
		{
			System.out.println("Division durch Null.");
			return 0;
		}

	}

	public Object get(String string)
	{
		// TODO Auto-generated method stub
		try
		{
			switch (string)
			{
			case "name":
				return name;
			case "birthyear":
				return birthyear;
			case "averageMarks":
				return getAverageMark();
			default:
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e)
		{
			System.out.println();
			return "?";
		}

	}
}