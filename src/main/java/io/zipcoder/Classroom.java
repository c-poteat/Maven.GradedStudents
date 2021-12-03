package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    // Declare instance variables
    private Student[] students;

    private int maxNumberOfStudents;

    // Constructor for maxNumberOfStudents
    public Classroom(int maxNumberOfStudents) {
        //Create maximum number of students
        this.students = new Student[maxNumberOfStudents];
    }

    // Create nullary constructor for 30 students
    public Classroom() {
        students = new Student[30];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double average = 0;
        for (Student pupil : students) {
            average = average + pupil.getAverageExamScore();
        }
        return average;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] = student;
            break;
        }
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> removeStudentArray = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < students.length; i++) {
            if (firstName.equals(lastName)) {
                removeStudentArray.remove(firstName);
                removeStudentArray.remove(lastName);
            }
        }
    }

    public void getStudentsByScore() {

    }

    public void getGradeBook() {

    }

    public static void main(String[] args) {

    }
}


//
//
//
//    Define method removeStudent(String firstName, String lastName)
//    The class Classroom should define a method which uses a firstName and lastName parameter to identify and remove the respective student from composite students object.
//    Ensure the array is re-ordered after the removal; Null values should be located in the final indices of the array.
//
//
//
//
//
//
//    Define method getStudentsByScore()
//    The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
//    If two students have the same class average, order them lexigraphically.
//
//
//
//
//
//
//    Define method getGradeBook()
//    The class Classroom should define a method getGradeBook() which returns a mapping of Student objects to a respective letter grade determined by creating a grading curve such that
//    An A is awarded to students whose class average is in the upper 10th percentile.
//    A B is awarded to students whose class average falls between the upper 11th and 29th percentile.
//    A C is awarded to students whose class average falls between the upper 30th and 50th percentile.
//    A D is awarded to students whose class average falls between the lower 51st and 89th percentile.
//    An F is awarded to students whose class average is in the lower 11th percentile.
//
//    */
//
