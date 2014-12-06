package list;

import java.util.ArrayList;

public class test
{

	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();

		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		b.add("a");
		b.add("b");
		b.add("c");
		b.add("d");
		b.add("e");
		a.remove(1);
		a.addAll(b);
		a.retainAll(b);
	}

}
