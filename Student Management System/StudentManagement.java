import java.util.ArrayList;
import java.io.*;

public class StudentManagement implements Serializable {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public ArrayList<Student> getStudents(boolean b) {
        return students;
    }

    // Method to write student data to a file
    public void writeToFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);
            objectOut.close();
            System.out.println("Student data has been written to " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Method to read student data from a file
    @SuppressWarnings("unchecked")
    public void readFromFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            students = (ArrayList<Student>) objectIn.readObject();
            objectIn.close();
            System.out.println("Student data has been read from " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}