import java.util.*;

public class StudentGradingSystem
{
    static void print(String m)
    {
        System.out.print(m);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();

        int choice;

        do
        {
            print("\n-------- Student Grade Management System --------\n");
            print("1. Add Student\n");
            print("2. Display All Students\n");
            print("3. Search Student by ID\n");
            print("4. Calculate and Display Average\n");
            print("5. Exit\n");
            print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    print("Enter student name: ");
                    String nme = sc.nextLine();

                    print("Enter student marks: ");
                    int mrks = sc.nextInt();
                    sc.nextLine();

                    if(mrks < 0 || mrks > 100)
                    {
                        print("Marks must be between 0 and 100.\n");
                        break;
                    }

                    student.add(new Student(id, nme, mrks));
                    print("Student added successfully!\n");
                    break;

                case 2:
                    if(student.isEmpty())
                    {
                        print("No students available.\n");
                    }
                    else
                    {
                        print("\nStudent Records:\n");

                        for(Student s : student)
                        {
                            s.displayDetails();
                            print("\n");
                        }
                    }
                    break;

                case 3:
                    print("Enter student ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for(Student s : student)
                    {
                        if(s.getStudentID() == searchId)
                        {
                            print("\nStudent Found:\n");
                            s.displayDetails();
                            print("\n");

                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        print("Student not found!\n");
                    }

                    break;

                case 4:
                    if(student.isEmpty())
                    {
                        print("No student records available.\n");
                    }
                    else
                    {
                        double total = 0;

                        for(Student s : student)
                        {
                            total += s.getMarks();
                        }

                        double average = total / student.size();

                        print(String.format("Average marks: %.2f\n", average));
                    }

                    break;

                case 5:
                    print("Exiting program...\n");
                    break;

                default:
                    print("Invalid choice. Please try again.\n");
            }

        }
        while(choice != 5);
    }
}