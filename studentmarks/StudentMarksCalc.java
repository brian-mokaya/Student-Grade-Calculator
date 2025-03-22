package studentmarks;

import java.util.Scanner;

public class StudentMarksCalc {

     
    int numberOfSubjects;
    int totalMarks;
    double average;
    Scanner scanner = new Scanner(System.in);
    int[] marks;
    char grade;



    public void inputMarks(){
        System.out.println("How many subjects do you have?");
        numberOfSubjects = scanner.nextInt();
        marks = new int[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++){

            System.out.println("Enter the marks for subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void calculateTotalMarks(){
        totalMarks = 0;
        for (int i = 0; i < marks.length; i++){
            totalMarks += marks[i];
        }
        System.out.println("The total marks is: " + totalMarks);
    }

    public void calculateAverage(){
        average = totalMarks / numberOfSubjects;
        System.out.println("The average mark is: " + average);
    }

    public void  calculateGrade(){
        if (average >= 90){
            grade = 'A';
        }
        else if (average >= 80){
            grade = 'B';
        }
        else if (average >= 70){
            grade = 'C';
        }
        else if (average >= 60){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
    }

    public void viewResults(){
        System.out.println("The total marks is: " + totalMarks);
        System.out.println("The average mark is: " + average);
        System.out.println("The grade is: " + grade);
    }

}