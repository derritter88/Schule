/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Mathias
 * 06.12.2014
 * Collections II / map / schaffer.java
 */
public class schaffer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("1025", "Josef Maier");
		m.put("1069", "Matthias Koller");
		m.put("3626", "Anita Mustermann");

		HashMap h = new HashMap();
		h.putAll(m);
		h.put("3626", "Anita Koller");
		m.remove("3626");

		Iterator i = m.entrySet().iterator();
		Iterator j = h.entrySet().iterator();
		System.out.println("HashMap m");
		while (i.hasNext())
		{
			Map.Entry entry = (Entry) i.next();
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("HashMap h");
		while (j.hasNext())
		{
			Map.Entry entry = (Entry) j.next();
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
