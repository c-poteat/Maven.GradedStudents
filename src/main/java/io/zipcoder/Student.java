package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    // Setup instance variables
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    // Constructor
    public Student(String firstName, String lastName, Double... examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Create a new arraylist
        this.examScores = new ArrayList<>(Arrays.asList(examScores));

    }

    // Setup setters and getters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //   Method getExamScores() a string representation of all exams taken.
    public String getExamScores() {
        String output = "Exam Scores:  \n";
        for (int i = 0; i < examScores.size(); i++) {
            output = output + "\t Exam " + (i + 1) + " -> ";
            output = output + examScores.get(i);
            output = output + "\n";

    /*   Format shown above
    Sample Output
    Exam Scores:
 	Exam 1 -> 100
 	Exam 2 -> 95
 	Exam 3 -> 123
 	Exam 4 -> 96
         */
        }
        return output;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        // Remove exam information
        examScores.remove(examNumber - 1);
        // Add exam information
        examScores.add(examNumber - 1, newScore);
    }

    public Double getAverageExamScore() {
        //Declare variable
        double examTotal = 0;
        // Iterate through exam scores for average
        for (double score : examScores) {
            //Add examTotal to score for overall total
            examTotal = examTotal + score;
        }
        // Get the average
        Double average = examTotal / examScores.size();
        return average;
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s %s\n" + "> Average Score: %.1f \n" + "> %s", firstName, lastName, getAverageExamScore(), getExamScores());
    }

}










