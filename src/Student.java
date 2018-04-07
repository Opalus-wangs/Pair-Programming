import java.util.ArrayList;
public class Student
{
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private String name;
	private String id;
	private int [] score;
	private int w;
	public Student(String name, String id,int [] h,int w)
	{
		this.name = name;
		this.id = id;
		this.score = h;
		this.w=w;
	}
	
	
	public String getname()
	{
		return this.name;
	}
	public void setname(String name)
	{
		if(name !=null)
			this.name = name;
	}
	public String getid()
	{
		return this.id;
	}
	public void setid(String id)
	{
		if(id !=null)
			this.id = id;
	}
	public int [] getscore()
	{
		return this.score;
	}
	/*public void setscore(int [] score)
	{
		if(score[]!=0)
			this.score = score;
	}*/
	public int  getw()
	{
		return this.w;
	}
	
}


	

