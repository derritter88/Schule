package vector;

import java.util.Enumeration;
import java.util.Vector;

public class haupt
{

	public static void main(String[] args)
	{
		Student s1 = new Student("Jörg", "Dittel", 8150);
		Student s2 = new Student("Daniel", "Schaffer", 2142);
		Student s3 = new Student("Regina", "Schalk", 4891);
		Student s4 = new Student("Michael", "Haushofer", 8150);
		Student s5 = new Student("Herr", "Admiral", 666);
		Vector<Student> v = new Vector<Student>();
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		v.add(s5);

		for (Enumeration<Student> e = v.elements(); e.hasMoreElements();)
		{
			System.out.println(e.nextElement());
		}
	}
}
