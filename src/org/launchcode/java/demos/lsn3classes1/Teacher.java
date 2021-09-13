package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public void setTeacherInfo(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }
    public String getTeacherInfo(){
        return(subject+": " + firstName + " " + lastName + ", years teaching: " + yearsTeaching);
    }
    public static void main(String[] args) {
        Teacher newTeacher = new Teacher();
        newTeacher.setTeacherInfo("Sally", "Ride", "physics", 5);
        newTeacher.getTeacherInfo();
        System.out.println(newTeacher.getTeacherInfo());
    }
}
