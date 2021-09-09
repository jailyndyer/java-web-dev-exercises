package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public double getGpa() {
        return gpa;
    }
}