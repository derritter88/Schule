package Tuerme_von_Hanoi;

import java.util.Stack;

public class tuerme
{

	public static void main(String[] args)
	{
		Stack turm1 = new Stack();
		Stack turm2 = new Stack();
		Stack turm3 = new Stack();

		for (int x = 1; x <= 10; x++)
		{
			turm1.push(x);
			System.out.println(turm1.peek());
		}
	}
}
