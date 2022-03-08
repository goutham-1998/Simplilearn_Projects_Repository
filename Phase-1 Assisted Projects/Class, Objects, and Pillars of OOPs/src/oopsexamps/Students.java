package oopsexamps;

public class Students {
	
	String name;
	int id;
	String branch;
	int classnum;
	public Students(String name,int id,String branch,int classnum)
	{
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.classnum = classnum;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	public String getBranch()
	{
		return branch;
	}
	public int getClassnum()
	{
		return classnum;
	}

	   @Override
	public String toString()
	{
		return(this.getName()+" "+this.getId()+" "+this.getBranch()+" "+this.getClassnum());
	}
	public static void main(String[] args) {
		
		Students s1 = new Students("Jessie",001,"CSE",1001);
		Students s2 = new Students("Ram",001,"CSE",1001);
		Students s3 = new Students("Raghu",001,"CSE",1001);
		Students s4 = new Students("Mary",001,"CSE",1001);
		
		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
		System.out.println(s3.toString()); 
		System.out.println(s4.toString()); 
		
		
		
		

	}

}
