import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println();

        System.out.print("Enter Student's name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter number of Subjects: ");
        int numSubjects = scanner.nextInt();
        
        double totalMarks = 0.0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }
        
        double averageMarks = totalMarks / numSubjects;
        
        String grade;
        if (averageMarks >= 90) {
            grade = "A  (Excellent)";
        } else if (averageMarks >= 80) {
            grade = "B  (Very Good)";
        } else if (averageMarks >= 70) {
            grade = "C (Good)";
        } else if (averageMarks >= 60) {
            grade = "D (Improvement Needed !)";
        } else {
            grade = "F (No Comments !)";
        }
        System.out.println();
        System.out.println("Calculating information....");
        System.out.println(
            
        );
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averageMarks);
        System.out.println("Grade: " + grade);
        

    }
}
