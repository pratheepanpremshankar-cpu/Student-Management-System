class Student
{
    private int studentID;
    private String studentName;
    private int marks;

    public Student(int stuID, String stuName, int mrks)
    {
        studentID = stuID;
        studentName = stuName;
        marks = mrks;
    }

    public String getName()
    {
        return studentName;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public int getMarks()
    {
        return marks;
    }

    public void displayDetails()
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
    }

    @Override
    public String toString()
    {
        return "Student Name: " + studentName +
               "\nStudent ID: " + studentID +
               "\nMarks Obtained: " + marks;
    }
}