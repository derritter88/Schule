package generic_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class coll_jahns
{

	public static void main(String[] args)
	{
		Integer();

		Double();

		print(Integer(), Double());
	}

	private static Vector<Double> Double()
	{
		Vector<Double> v = new Vector<Double>();
		v.add(1.01);
		v.add(2.02);
		v.add(3.03);
		System.out.println(v);
		return v;
	}

	private static ArrayList<Integer> Integer()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		return al;
	}

	private static void print(List<? extends Number> numbers, Vector<Double> vector)
	{
		for (Number x : numbers)
		{
			System.out.println(x.toString());
		}

	}
}
