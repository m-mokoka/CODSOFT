import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * DummyData
 */
public class Student {
    private String name;
    private List<SubjectGrade> subjectGrades;

    public Student(String name, List<SubjectGrade> subjectGrades) {
        this.name = name;
        this.subjectGrades = subjectGrades;
    }

    public String getName() {
        return  name;
    }
    
    public List<SubjectGrade> getSubjectGrades(){
        return subjectGrades;
    }
}

    class SubjectGrade {
        private String subject;
        private double grade;

        public SubjectGrade(String subject, double grade){
            this.subject = subject;
            this.grade = grade;
        }

        public String getSubject() {
            return subject;
        }

        public double getGrade() {
            return grade;
        }
    }

    class DummyData {
        public static List<Student> generateDummyData() {
            List<Student> students = new ArrayList<>();

            List<SubjectGrade> subjectGradesStudent1 = Arrays.asList(
                new SubjectGrade("Math", 95.0),
                new SubjectGrade("English", 87.0),
                new SubjectGrade("Science", 92.0),
                new SubjectGrade("Computer Science", 95.0)
                
            );

            List<SubjectGrade> subjectGradesStudent2 = Arrays.asList(
                new SubjectGrade("Math", 78.0),
                new SubjectGrade("English", 72.0),
                new SubjectGrade("Science", 75.0),
                new SubjectGrade("Computer Science", 80.0)
            );
            
            List<SubjectGrade> subjectGradesStudent3 = Arrays.asList(
                new SubjectGrade("Math", 54.0),
                new SubjectGrade("English", 88.0),
                new SubjectGrade("Science", 51.0),
                new SubjectGrade("Computer Science", 67.0)
        );

        students.add(new Student("Hermoine Granger", subjectGradesStudent1));
        students.add(new Student("Harry Potter", subjectGradesStudent2));
        students.add(new Student("Ron Weasley", subjectGradesStudent3));

        return  students;
    
    }
}

    