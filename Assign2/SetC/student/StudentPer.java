package student;

/*
 * Set C - c
 * Create another class StudentPer with a method to find the percentage of the student. 
 */

public class StudentPer {
    public double calculatePercentage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }
}
