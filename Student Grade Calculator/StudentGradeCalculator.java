import java.util.List;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        //import DummyData class and use it to get dummy data 
        List<Student>  students = DummyData.generateDummyData();

        for (Student student : students) {
            System.out.println("Student:  " + student.getName());
            System.out.println("Subject Grades: " + student.getSubjectGrades());

            double totalMarks = calculateTotalMarks(student.getSubjectGrades());
            double averagePercentage = calculateAveragePercentage(totalMarks, student.getSubjectGrades().size());
            String grade = assignGrade(averagePercentage);

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println();
        }
    }

    private static double calculateTotalMarks(List<SubjectGrade> subjectGrades) {
        double totalMarks = 0;
        for (SubjectGrade subjectGrade : subjectGrades) {
            totalMarks += subjectGrade.getGrade();
        }
        return totalMarks;
    }
    
    private static  double calculateAveragePercentage(double totalMarks, int numberOfSubjects){
        return totalMarks / numberOfSubjects;
    }

    private static String assignGrade(double averagePercentage) {
        if (averagePercentage >= 90.0) {
            return "A (Distinction)";
        } else if  (averagePercentage >=80.0) {
            return "B (Excellent)";
        } else if (averagePercentage >=70.0) {
            return "C  (Good)";
        } else if  (averagePercentage >=60.0) {
            return "D (Pass)";
        } else {
            return  "F (Fail)";
        }
    
    }
}
