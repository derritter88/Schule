package generic_collections;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;

public class coll_haushofer
{

	public static void main(String[] args)
	{

		ArrayList aa = new ArrayList();
		for (int j = 0; j < 3; j++)
		{
			aa.add(new JButton("Button " + j + 1));
			JButton butt = (JButton) aa.get(j);
			butt.setBackground(Color.white);
		}

		ArrayList<JButton> al = new ArrayList<JButton>();

		al.add(new JButton("Button 1"));
		al.add(new JButton("Button 2"));
		al.add(new JButton("Button 3"));

		for (JButton x : al)
		{

		}

	}
}
