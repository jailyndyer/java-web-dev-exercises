package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public void setSubject(String aSubject) {

        subject = aSubject;
    }

    public void setYearsTeaching(int numYearsTeaching) {

        yearsTeaching = numYearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}