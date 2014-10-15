package RunTime;

import java.io.IOException;

public class main
{

	public static void main(String[] args)
	{
		Runtime runtime = Runtime.getRuntime();

		try
		{
			Process process = runtime.exec("C:\\xampp\\xampp-control.exe");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
