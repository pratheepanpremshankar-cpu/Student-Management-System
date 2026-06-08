class Student
{
	int studentid;
	String studentName;
	int marks;
	
	public Student(int stuID , String stuName , int mrks)
	{
		studentid = stuID;
		studentName = stuName;
		marks = mrks;
	}
	
	public String getName()
	{
		return studentName;
	}
	
	public int getID()
	{
		return studentid;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public String toString()
	{
		return "Student name "+studentName+"\nStudent id "+studentid+"\nMarks obtained "+marks;
	}
}