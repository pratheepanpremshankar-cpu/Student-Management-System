case 1:
    print("Enter student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    print("Enter student name: ");
    String nme = sc.nextLine();

    print("Enter the marks: ");
    int mrks = sc.nextInt();
    sc.nextLine();

    student.add(new Student(id, nme, mrks));

    break;