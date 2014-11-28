package vector;

public class Student
{
	String vName;
	String nName;
	int MatrNr;

	public Student(String vName, String nName, int matrNr)
	{
		super();
		this.vName = vName;
		this.nName = nName;
		MatrNr = matrNr;
	}

	public String getvName()
	{
		return vName;
	}

	public void setvName(String vName)
	{
		this.vName = vName;
	}

	public String getnName()
	{
		return nName;
	}

	public void setnName(String nName)
	{
		this.nName = nName;
	}

	public int getMatrNr()
	{
		return MatrNr;
	}

	public void setMatrNr(int matrNr)
	{
		MatrNr = matrNr;
	}

}
