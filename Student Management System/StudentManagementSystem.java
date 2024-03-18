import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nStudent Management System");
                System.out.println("1. Add a new student");
                System.out.println("2. Search for a student");
                System.out.println("3. Display all students");
                System.out.println("4. Write student data to file");
                System.out.println("5. Read student data from file");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter roll number: ");
                        int rollNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();

                        Student newStudent = new Student(name, rollNumber, grade);
                        studentManagement.addStudent(newStudent);
                        System.out.println("Student added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter roll number to search: ");
                        int searchRollNumber = scanner.nextInt();
                        scanner.nextLine(); 

                        Student foundStudent = studentManagement.searchStudent(searchRollNumber);
                        if (foundStudent != null) {
                            System.out.println("Student found: " + foundStudent);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;
                    case 3:
                        studentManagement.displayAllStudents();
                        break;
                    case 4:
                        studentManagement.writeToFile("studentData.ser");
                        break;
                    case 5:
                        studentManagement.readFromFile("studentData.ser");
                        break;
                    case 6:
                        System.out.println("Exiting the application.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}