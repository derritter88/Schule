package Tuerme_von_Hanoi;

import java.util.Stack;

public class hanoi1
{

	static Stack t1 = new Stack(); // Türme
	static Stack t2 = new Stack();
	static Stack t3 = new Stack();

	int zaehler;

	public static void main(String[] args)
	{
		t1.push(50);
		t1.push(40);
		t1.push(30);
		t1.push(20);
		t1.push(10);
		print();
		move(t1, t2, t3, 5);
	}

	private static void move(Stack a, Stack b, Stack c, int j)
	{

		if (j == 1)
		{
			c.push(a.pop());
		}
		else
		{
			move(a, c, b, j - 1);
			move(a, b, c, 1);
			move(b, a, c, j - 1);
		}
	}

	private static void print()
	{
		System.out.println("Turm A:			Turm B:			Turm C:");

		if (t1.size() != 0)
		{
			for (int i = 0; i < t1.size(); i++)
			{
				System.out.println("  " + t1.elementAt(t1.size() - i - 1));
			}
		}
		if (t2.size() != 0)
		{
			for (int i = 0; i < t2.size(); i++)
			{
				System.out.println("  " + "			" + t2.elementAt(t2.size() - i - 1));
			}
		}
		if (!t3.empty())
		{
			for (int i = 0; i < t3.size(); i++)
			{
				System.out.println("  " + "						" + t3.elementAt(t3.size() - i - 1));
			}
			if (t3.size() == 5)
			{
				System.exit(1);
			}
		}
	}
}
