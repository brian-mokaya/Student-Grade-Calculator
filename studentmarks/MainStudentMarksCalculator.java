package studentmarks;

public class MainStudentMarksCalculator {

    public static void main(String[] args) {
        StudentMarksCalc studentMarksCalc = new StudentMarksCalc();
        studentMarksCalc.inputMarks();
        studentMarksCalc.calculateTotalMarks();
        studentMarksCalc.calculateAverage();
        studentMarksCalc.calculateGrade();
        studentMarksCalc.viewResults();
    }
}

