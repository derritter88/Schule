package hash;

import java.util.Enumeration;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class dictionary
{

	public static void main(String[] args)
	{
		Hashtable d = new Hashtable();
		d.put("essen", "food");
		d.put("trinken", "drinking");
		d.put("zahl", "number");
		d.put("zukunft", "future");
		d.put("handy", "mobilephone");
		d.put("buch", "book");
		d.put("mensch", "human");
		d.put("genieﬂen", "enjoying");
		Enumeration e = d.keys();
		while (e.hasMoreElements())
		{
			String alias = (String) e.nextElement();
			System.out.println(alias + " heiﬂt " + d.get(alias));
		}
	}
}
