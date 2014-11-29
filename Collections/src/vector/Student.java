package vector;

public class Student
{
	String vName;
	String nName;
	int matrNr;

	public Student(String vName, String nName, int matrNr)
	{
		super();
		this.vName = vName;
		this.nName = nName;
		this.matrNr = matrNr;
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
		return matrNr;
	}

	public void setMatrNr(int matrNr)
	{
		this.matrNr = matrNr;
	}

	@Override
	public String toString()
	{
		return "Student [Vorname= " + vName + "; Nachname= " + nName + "; MatrNr= " + matrNr + "]";
	}

}
