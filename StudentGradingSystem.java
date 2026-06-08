case 3:
	print("Enter student ID: ");
	int searchId = sc.nextInt();
	sc.nextLine();
	
	boolean found = false;
	
	for(Student s : student)
	{
		if(s.getStudentID() == searchId)
		{
			
			s.displayDetails();
			found = true;
			break;
		}
	}
	
	if(!found)
	{
		print("Student not found!..");
	}
	
	break;
	
case 4:
	if(student.isEmpty())
	{
		print("No student records available");
	}
	
	else
	{
		double total = 0;
		
		for(Student s : student)
		{
			total +=s.getMarks();
		}
		
		double average = total/student.size();
		
		print("Average marks: "+average);
	}
	
	break;