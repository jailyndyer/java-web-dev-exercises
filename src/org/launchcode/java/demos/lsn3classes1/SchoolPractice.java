package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student();
        me.setName("Jailyn");
        me.setStudentId(123);
        me.setNumberOfCredits(160);
        me.setGpa(4.0);
        System.out.println("My name is " + me.getName());
        System.out.println("My student ID is " + me.getStudentId());
        System.out.println("I have " + me.getNumberOfCredits() + " hours of classes and a " + me.getGpa() + "GPA");
    }
}
