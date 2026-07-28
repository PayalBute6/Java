package Part2_Methods;

class StudentResult {

    // Method to calculate percentage
    double calculatePercentage(double totalMarksObtained, double maximumMarks) {
        if (maximumMarks <= 0) {
            System.out.println("Invalid maximum marks!");
            return 0.0;
        }
        return (totalMarksObtained / maximumMarks) * 100;
    }

    // Method to display student result and grade
    void displayResult(String name, double percentage) {
        System.out.println("Student Name: " + name);
        System.out.printf("Percentage  : %.2f%%\n", percentage);

        // Determine grade based on percentage
        if (percentage >= 90) {
            System.out.println("Grade       : A+ (Outstanding)");
        } else if (percentage >= 75) {
            System.out.println("Grade       : A (Distinction)");
        } else if (percentage >= 60) {
            System.out.println("Grade       : B (First Class)");
        } else if (percentage >= 40) {
            System.out.println("Grade       : C (Pass)");
        } else {
            System.out.println("Grade       : F (Fail)");
        }
        System.out.println("-----------------------------------");
    }
}

public class Program07_StudentResult {
    public static void main(String[] args) {
        StudentResult evaluator = new StudentResult();

        // Student 1 evaluation
        String s1Name = "Rohan Sharma";
        double s1Marks = 435;
        double maxMarks = 500;

        double s1Percentage = evaluator.calculatePercentage(s1Marks, maxMarks);
        evaluator.displayResult(s1Name, s1Percentage);

        // Student 2 evaluation
        String s2Name = "Ananya Roy";
        double s2Marks = 280;

        double s2Percentage = evaluator.calculatePercentage(s2Marks, maxMarks);
        evaluator.displayResult(s2Name, s2Percentage);
    }
}
