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
			for (int i = 0; i <= marks.length; i++)
			{
				int a = marks[i];
				int b = i+1;
				float total = a+a;
				total= total /b;
				return  total;
			}
		}
		catch(Exception z)
		{
			System.out.println("Division durch Null.");
		}
	}
}