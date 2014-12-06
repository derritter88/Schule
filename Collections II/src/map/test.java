package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test
{

	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("Hallo", "Hello");
		m.put("Du", "You");
		m.put("Essen", "Eat");
		m.put("Kerze", "Chandle");
		m.put("Maus", "Mouse");
		m.put("Katze", "Cat");

		Iterator i = m.entrySet().iterator();
		while (i.hasNext())
		{
			Map.Entry entry = (Map.Entry) i.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		int a = m.size();
		System.out.println(a);
		System.out.println(m.containsValue("Eat"));
		System.out.println(m.containsValue("eat"));
		m.clear();

	}
}
